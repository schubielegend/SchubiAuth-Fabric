package dev.majanito;

import dev.majanito.utils.SessionUtils;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.session.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SessionIDLoginMod implements ModInitializer {
	public static final String MOD_ID = "session-id-login-mod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static Session originalSession;

	public static Session currentSession;

	public static boolean overrideSession = false;


	@Override
	public void onInitialize() {

		originalSession = SessionUtils.getSession();
		currentSession = originalSession;
		overrideSession = true;

		String MOD_VERSION = FabricLoader.getInstance().getModContainer(MOD_ID).map(container -> container.getMetadata().getVersion().getFriendlyString()).orElse("1.?.?");
		String MOD_AUTHOR = FabricLoader.getInstance().getModContainer(MOD_ID).map(c -> c.getMetadata().getAuthors().isEmpty() ? "Unknown" : c.getMetadata().getAuthors().iterator().next().getName()).orElse("Unknown");

		ClientTickEvents.END_CLIENT_TICK.register(client -> {
			if (client.getWindow() != null) {
				MinecraftClient.getInstance().getWindow().setTitle("SessionID Login • v" + MOD_VERSION + " • by " + MOD_AUTHOR);
			}
		});
	}

}