package net.bri4nholl4nd.fafnir.util;

import net.bri4nholl4nd.fafnir.FafnirMod;
import net.bri4nholl4nd.fafnir.block.ModBlocks;
import net.bri4nholl4nd.fafnir.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FafnirMod.MOD_ID);

    public static final Supplier<CreativeModeTab> FAFNIR_TAB = CREATIVE_MODE_TABS.register("fafnir_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BLUE_PEARL.get()))
                    .title(Component.translatable("creativetab.fafnir.fafnir_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.BLUE_PEARL);
                        output.accept(ModBlocks.LIMESTONE);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
