package custom_autorole.custom_autorole;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class CustomAutorole extends JavaPlugin {
    private static CustomAutorole instance;
    public static CustomAutorole getInstance() { return instance; }







    @Override
    public void onEnable() {
        instance = this;
        System.out.println(ChatColor.AQUA + "Plugin initiated");
        this.saveDefaultConfig();
        this.getCommand("Autorole").setExecutor(new AutoroleCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
