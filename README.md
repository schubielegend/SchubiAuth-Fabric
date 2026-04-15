# 🪪 Session ID Login Mod


A lightweight Fabric client-side mod that adds a GUI to log in using Minecraft session IDs.

> 🔒 No account switching tools, launchers, or file editing required — just paste your session token and you're in.

---

## 🧭 Available Versions

| Minecraft Version | Branch     | Link                                                                 |
|-------------------|------------|----------------------------------------------------------------------|
| 1.21.11            | `main`     | [View Branch](https://github.com/SchubieLegend/SchubiAuth-Fabric/releases/tag/SchubiAuthFabric)     |


---

## ✨ Features

- 🧩 Adds a login screen to input your Minecraft session ID (Bearer token)
- ✅ Displays current login status (`Valid` or `Invalid`) with real-time validation
- 💬 Shows username and session info in the Multiplayer screen
- 🧑‍💼 Built-in screen to **edit your session account**:
  - 🔤 Change Minecraft **username**
  - 🖼️ Change Minecraft **skin** via URL
- 🛡️ Protects your main account: edits only allowed for session logins
- 🎯 Fully client-side — no server-side impact
- 🖥️ Clean UI that blends into the default Minecraft style

---

## 📥 Installation

1. Download the mod `.jar` from [Releases](https://github.com/SchubieLegend/SchubiAuth-Fabric/releases/tag/SchubiAuthFabric)
2. Place it in your `.minecraft/mods` folder
3. Launch the game using a Fabric-enabled profile

> 💡 Requires [Fabric Loader](https://fabricmc.net/use/), [Fabric API](https://modrinth.com/mod/fabric-api), and **Java 21**

---

## ⚙️ How It Works

- You’ll find a new **Login** button on the **Multiplayer** screen
- Paste your session token and click Login — no restart needed
- An indicator shows whether the session is valid
- A second button opens the **Edit Account** screen
- There, you can safely update your session account’s name or skin

---

## 🛠️ For Developers

- Built for **Minecraft 1.21.5**
- Requires **Java 21**
- Uses **Gradle** and **Fabric Loom**

---

## 📸 Screenshots

**Multiplayer Screen**  
![Multiplayer Screen](https://github.com/user-attachments/assets/05d1ba99-01c5-429d-8feb-d0523a807df3)

**Login Screen (Before Session Login)**  
![Login Before](https://github.com/user-attachments/assets/cf19e550-b7fa-4154-a160-0b071c04c4e7)

**Login Screen (After Session Login)**  
![Login After](https://github.com/user-attachments/assets/0922a793-531b-4ccc-a70b-e7a9bd2d40a3)

**Edit Account Screen (On Original Session)**  
![Edit Account Original](https://github.com/user-attachments/assets/4449124d-0cd1-416d-8187-86aef753dd5b)

**Edit Account Screen (On Session ID)**  
![Edit Account Session](https://github.com/user-attachments/assets/1f8cd89f-aa8b-4c6a-b154-46785984e00f)

---

## 🤝 Contributions

Issues and PRs are welcome! Suggestions and improvements are appreciated — feel free to contribute or discuss ideas.
