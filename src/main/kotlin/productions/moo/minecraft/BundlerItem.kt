package productions.moo.minecraft

import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.item.BlockItem
import net.minecraft.item.ItemGroup

class BundlerItem: BlockItem(BundlerInitializer.BUNDLER_BLOCK, FabricItemSettings().group(ItemGroup.INVENTORY)) {
}