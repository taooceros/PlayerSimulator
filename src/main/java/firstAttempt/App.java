package firstAttempt;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Cow;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;

public class App extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        getLogger().info("Hello, SpigotMC!");
        Bukkit.getPluginManager().registerEvents(this, this);
    }
    
    

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
    if (command.getName().equalsIgnoreCase("demo")) { // 判断输入的指令是否是 /demo
        if (!(sender instanceof Player)) { // 判断输入者的类型 为了防止出现 控制台或命令方块 输入的情况
        sender.sendMessage("你必须是一名玩家!");
        return true; // 这里返回true只是因为该输入者不是玩家,并不是输入错指令,所以我们直接返回true即可
        }
        // 如果我们已经判断好sender是一名玩家之后,我们就可以将其强转为Player对象,把它作为一个"玩家"来处理
        Player player = (Player) sender;
        World world = player.getWorld();
        Playermanager playermanager = new Playermanager();
        playermanager.createPlayer(player, args[0]);
    
        player.sendMessage("你成功的执行了指令/demo");
        
        return true; // 返回true防止返回指令的usage信息
    }
    return false;
    }

    @Override
    public void onDisable() {
        getLogger().info("See you again, SpigotMC!");
    }
}