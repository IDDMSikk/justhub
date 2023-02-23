package pl.iddmsdev.justhub.essentials.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import pl.iddmsdev.justhub.essentials.Main;

public class HelpCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        for(String message : Main.config.getStringList("help-command")) {
            Player p = (Player) sender;
            p.sendMessage(ChatColor.translateAlternateColorCodes('&', message));
        }
        return true;
    }
}
