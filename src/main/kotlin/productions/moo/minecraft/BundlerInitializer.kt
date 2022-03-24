package productions.moo.minecraft

import net.fabricmc.api.ModInitializer
import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricBlockSettings
import net.minecraft.block.Blocks
import net.minecraft.util.Identifier
import productions.moo.BundlerBlock

class BundlerInitializer: ModInitializer {

    override fun onInitialize() {
        TODO("Not yet implemented")
    }

    companion object {
        const val MOD_ID = "bundler"
        const val BUNDLER = "bundler"
        val BUNDLER_BLOCK = BundlerBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE))
        val BUNDLER_IDENTIFIER = Identifier(MOD_ID, BUNDLER)
    }
}