package net.bri4nholl4nd.fafnir.datagen;

import net.bri4nholl4nd.fafnir.FafnirMod;
import net.bri4nholl4nd.fafnir.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, FafnirMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.BLUE_PEARL.get());
    }
}
