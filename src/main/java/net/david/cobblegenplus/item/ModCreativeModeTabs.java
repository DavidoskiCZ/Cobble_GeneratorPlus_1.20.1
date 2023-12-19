package net.david.cobblegenplus.item;

import net.david.cobblegenplus.CobbleGenPlus;
import net.david.cobblegenplus.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CobbleGenPlus.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TEST_TAB = CREATIVE_MODE_TABS.register("test_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TESTITEM.get()))
                    .title(Component.translatable("creativetab.test_tab"))
                    .displayItems((itemDisplayParameters, pOutput) -> {
                        pOutput.accept(ModItems.TESTITEM.get());

                        //test přidání random itemu z vanily do tabu
                        pOutput.accept(Items.DIAMOND);
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> COBBLEGENPLUS_TAB = CREATIVE_MODE_TABS.register("coblegenplus_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Items.COBBLESTONE))
                    .title(Component.translatable("creativetab.cobblegenplus_tab"))
                    .displayItems((itemDisplayParameters, pOutput) -> {
                        pOutput.accept(ModItems.GENERATOR_CORE_COMPLETE.get());
                        pOutput.accept(ModItems.GENERATOR_CORE_PART4.get());
                        pOutput.accept(ModItems.GENERATOR_CORE_PART3.get());
                        pOutput.accept(ModItems.GENERATOR_CORE_PART2.get());
                        pOutput.accept(ModItems.GENERATOR_CORE_PART1.get());
                        pOutput.accept(ModItems.HIGH_TECH_REDSTONE_COMPONENTS.get());
                        pOutput.accept(ModItems.ADVANCED_REDSTONE_COMPONENTS.get());
                        pOutput.accept(ModItems.GENERATOR_POWER_INTAKE.get());
                        pOutput.accept(ModItems.GENERATOR_POWERING_SYSTEM.get());
                        pOutput.accept(ModItems.GENERATOR_CASING.get());
                        pOutput.accept(ModItems.GENERATOR_ENCASED_CASING.get());
                        pOutput.accept(ModItems.POWERING_SYSTEM_CASING.get());
                        pOutput.accept(ModItems.GENERATOR_GLASS.get());

                        pOutput.accept(ModBlocks.NETHER_STAR_BLOCK.get());

                    })
                    .build());

    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
