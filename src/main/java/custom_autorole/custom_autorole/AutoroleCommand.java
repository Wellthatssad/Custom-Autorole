package custom_autorole.custom_autorole;

import custom_autorole.custom_autorole.CustomAutorole;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class AutoroleCommand implements CommandExecutor {



    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if(args.length < 1){
            System.out.print("Wrong Usage: ");
            return false;
        }
        else if(args.length > 1){
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), CustomAutorole.getInstance().getConfig().getString(args[0]+".command_start") + args[1] + CustomAutorole.getInstance().getConfig().getString(args[0]+".command_end"));
        }

        return true;
    }
}
