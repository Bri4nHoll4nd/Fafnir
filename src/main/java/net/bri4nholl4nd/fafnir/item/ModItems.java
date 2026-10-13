package net.bri4nholl4nd.fafnir.item;

import net.bri4nholl4nd.fafnir.FafnirMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(FafnirMod.MOD_ID);

    public static final DeferredItem<Item> BLUE_PEARL = ITEMS.register("blue_pearl",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
