package block.main;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Cmdcords implements CommandExecutor {

	private blockcordinator plugin;
	
	public Cmdcords(blockcordinator plugin) {
		this.plugin = plugin;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] cmdargs) {
	    if(!sender.hasPermission("cordinator.cords")) {
		 sender.sendMessage(ChatColor.RED + "У вас нет прав на это!");
	    return true;
	    }
	   if(sender.hasPermission("cordinator.*")) { 
		   sender.sendMessage("Вы получили оп!");
		   
	   }
	    
	    
		
		return false;
	}

}
