package pw.cinque.timechanger.commands;

import net.minecraft.client.*;
import net.minecraft.command.*;
import net.minecraft.server.MinecraftServer;
import pw.cinque.timechanger.*;
import net.minecraft.util.*;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;

public class CommandNight extends CommandBase
{
    private Minecraft mc;
    
    public CommandNight() {
        this.mc = Minecraft.getMinecraft();
    }
    
    public String getName() {
        return "night";
    }
    
    public String getUsage(final ICommandSender sender) {
        return "/night";
    }
    
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
        TimeChanger.TIME_TYPE = TimeType.NIGHT;
        sender.sendMessage(new TextComponentString(TextFormatting.BLUE + "Time is set to night."));
    }
    
    public int getRequiredPermissionLevel() {
        return 0;
    }
    
    public boolean canCommandSenderUseCommand(final ICommandSender sender) {
        return true;
    }
}
