package com.vanillaflux.utils;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.vanillaflux.VanillaFluxMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.StringNbtReader;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Utils {
    private static Logger LOGGER;
    private static VanillaFluxMod mod;


    public static void init(VanillaFluxMod mod) {
        Utils.mod = mod;
        LOGGER = LoggerFactory.getLogger("VF-Stats");
        ItemStack item = Items.NETHERITE_SWORD.getDefaultStack().copy();
        NbtCompound nbt = new NbtCompound();
        try {
            nbt = StringNbtReader.parse("{CustomModelData:300}");
        } catch (CommandSyntaxException e) {
            throw new RuntimeException(e);
        }
        item.setNbt(nbt);
        Registry.register(Registries.ITEM, new Identifier("vanillaflux", "emerald_carrot"), new Item(new FabricItemSettings()));
    }

    public static void log(String message) {
        LOGGER.info(message);
    }

    public static VanillaFluxMod getMod() {
        return mod;
    }


}
