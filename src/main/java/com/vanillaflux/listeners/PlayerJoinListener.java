package com.vanillaflux.listeners;

import com.vanillaflux.utils.Utils;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayNetworkHandler;
import net.minecraft.stat.Stats;
import org.json2.JSONObject;

public class PlayerJoinListener implements ServerPlayConnectionEvents.Join {
    @Override
    public void onPlayReady(ServerPlayNetworkHandler handler, PacketSender sender, MinecraftServer server) {
        JSONObject json = new JSONObject("{}");
        JSONObject dist = new JSONObject();
        dist.put("walked",handler.player.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(Stats.WALK_ONE_CM)));
        dist.put("boated",handler.player.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(Stats.BOAT_ONE_CM)));
        dist.put("flown",handler.player.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(Stats.AVIATE_ONE_CM)));
        dist.put("climbed",handler.player.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(Stats.CLIMB_ONE_CM)));
        dist.put("fallen",handler.player.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(Stats.FALL_ONE_CM)));
        dist.put("crouched",handler.player.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(Stats.CROUCH_ONE_CM)));
        dist.put("horse",handler.player.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(Stats.HORSE_ONE_CM)));
        dist.put("sprinted",handler.player.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(Stats.SPRINT_ONE_CM)));
        dist.put("crouched",handler.player.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(Stats.CROUCH_ONE_CM)));
        dist.put("pig",handler.player.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(Stats.PIG_ONE_CM)));
        dist.put("strider",handler.player.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(Stats.STRIDER_ONE_CM)));
        dist.put("minecart",handler.player.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(Stats.MINECART_ONE_CM)));
        dist.put("swam",handler.player.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(Stats.SWIM_ONE_CM)));
        dist.put("walked_on_water",handler.player.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(Stats.WALK_ON_WATER_ONE_CM)));
        dist.put("walked_under_water",handler.player.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(Stats.WALK_UNDER_WATER_ONE_CM)));
        json.append("distance",dist);
        json.append("deaths", handler.player.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(Stats.DEATHS)));
        Utils.log(json.toString());
    }
}
