package block.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class blockcordinator extends JavaPlugin {
	
	public void onEnable() {
		
		Bukkit.getPluginManager().registerEvents(new cordinator(), this);
		getLogger().info("Enabled!");
		
	}
   public void onDisabled() {
		
		getLogger().info("Disabled!");
		
	}

}
