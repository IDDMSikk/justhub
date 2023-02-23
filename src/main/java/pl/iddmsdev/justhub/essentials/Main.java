package pl.iddmsdev.justhub.essentials;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;
import org.yaml.snakeyaml.Yaml;
import pl.iddmsdev.justhub.essentials.commands.HelpCommand;

import java.io.File;

public final class Main extends JavaPlugin {

    private File configFile = new File(this.getDataFolder(), "config.yml");
    public static FileConfiguration config;

    @Override
    public void onEnable() {
        config = YamlConfiguration.loadConfiguration(configFile);
        System.out.println("Włączono plugin justhub.");
        this.getCommand("pomoc").setExecutor(new HelpCommand());
        if(!configFile.exists()) {
            saveResource("config.yml", false);
        }
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
