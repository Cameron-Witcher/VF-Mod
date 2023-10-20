package com.vanillaflux.utils.items;

import net.minecraft.block.entity.HopperBlockEntity;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

public class EmeraldCarrot extends Item {


    public EmeraldCarrot(Settings settings) {
        super(settings);
        settings.food(new FoodComponent.Builder().hunger(16).alwaysEdible().saturationModifier(16).build());
    }


}
