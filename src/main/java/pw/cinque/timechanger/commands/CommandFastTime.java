package pw.cinque.timechanger.commands;

import net.minecraft.client.*;
import net.minecraft.command.*;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.*;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;

import org.apache.commons.lang3.math.*;
import pw.cinque.timechanger.*;

public class CommandFastTime extends CommandBase
{
    private Minecraft mc;
    
    public CommandFastTime() {
        this.mc = Minecraft.getMinecraft();
    }
    
    public String getName() {
        return "fasttime";
    }
    
    public String getUsage(final ICommandSender sender) {
        return "/fasttime <multiplier>";
    }
    
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
        if (args.length == 0) {
        	 sender.sendMessage((ITextComponent) new TextComponentString(TextFormatting.RED + "Please use /fasttime <multiplier>!"));
            return;
        }
        final double multiplier = NumberUtils.toDouble(args[0], -1.0);
        if (multiplier < 0.0) {
        	 sender.sendMessage(new TextComponentString(TextFormatting.RED + "Invalid multiplier!"));
            return;
        }
        TimeChanger.TIME_TYPE = TimeType.FAST;
        TimeChanger.fastTimeMultiplier = multiplier;
        sender.sendMessage(new TextComponentString(TextFormatting.GRAY + "Time set to fast (" + multiplier + ")."));
    }
    
    public int getRequiredPermissionLevel() {
        return 0;
    }
    
    public boolean canCommandSenderUseCommand(final ICommandSender sender) {
        return true;
    }
}
