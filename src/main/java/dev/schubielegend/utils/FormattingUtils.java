package dev.majanito.utils;

import net.minecraft.text.Style;
import net.minecraft.text.Text;

public class FormattingUtils {
    public static Text surroundWithObfuscated(Text baseText, int count) {
        Style baseStyle = baseText.getStyle().withObfuscated(false);

        Style obfStyle = baseStyle.withObfuscated(true);

        String padding = "@".repeat(count);

        Text obfuscatedLeft  = Text.literal(padding + " ").setStyle(obfStyle);
        Text obfuscatedRight = Text.literal(" " + padding).setStyle(obfStyle);
        Text middle          = baseText.copy().setStyle(baseStyle);

        return Text.empty()
                .append(obfuscatedLeft)
                .append(middle)
                .append(obfuscatedRight);
    }
}
