package net.david.cobblegenplus.item;

import net.david.cobblegenplus.CobbleGenPlus;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CobbleGenPlus.MOD_ID);

    public static final RegistryObject<Item> TESTITEM = ITEMS.register("testitem",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GENERATOR_CASING = ITEMS.register("generator_casing",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GENERATOR_GLASS = ITEMS.register("generator_glass",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GENERATOR_POWER_INTAKE = ITEMS.register("generator_power_intake",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ADVANCED_REDSTONE_COMPONENTS = ITEMS.register("advanced_redstone_components",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> HIGH_TECH_REDSTONE_COMPONENTS = ITEMS.register("high_tech_redstone_components",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GENERATOR_CORE_COMPLETE = ITEMS.register("generator_core_complete",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GENERATOR_CORE_PART4 = ITEMS.register("generator_core_part4",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GENERATOR_CORE_PART3 = ITEMS.register("generator_core_part3",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GENERATOR_CORE_PART2 = ITEMS.register("generator_core_part2",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GENERATOR_CORE_PART1 = ITEMS.register("generator_core_part1",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GENERATOR_POWERING_SYSTEM = ITEMS.register("generator_powering_system",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
