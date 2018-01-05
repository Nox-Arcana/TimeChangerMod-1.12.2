package pw.cinque.timechanger.commands;

import net.minecraft.client.*;
import net.minecraft.command.*;
import net.minecraft.server.MinecraftServer;
import pw.cinque.timechanger.*;
import net.minecraft.util.*;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;

public class CommandSunSet extends CommandBase
{
    private Minecraft mc;
    
    public CommandSunSet() {
        this.mc = Minecraft.getMinecraft();
    }
    
    public String getName() {
        return "sunset";
    }
    
    public String getUsage(final ICommandSender sender) {
        return "/sunset";
    }
    
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
        TimeChanger.TIME_TYPE = TimeType.SUNSET;
        sender.sendMessage(new TextComponentString(TextFormatting.YELLOW + "Time is set to sunset."));
    }
    
    public int getRequiredPermissionLevel() {
        return 0;
    }
    
    public boolean canCommandSenderUseCommand(final ICommandSender sender) {
        return true;
    }
}
