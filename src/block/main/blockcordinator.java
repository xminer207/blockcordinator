package block.main;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class blockcordinator extends JavaPlugin {
	
	public void onEnable() {
		File config = new File(getDataFolder() + File.separator + "config.yml");
		
		if(!config.exists()) {
			
			getConfig().options().copyDefaults(true);
		
		}
		
		Bukkit.getPluginManager().registerEvents(new cordinator(), this);
		getCommand("cords").setExecutor(new Cmdcords(this));		
		
		
		getLogger().info("Enabled!");
		
	}
   public void onDisabled() {
		
		getLogger().info("Disabled!");
		
	}

}
