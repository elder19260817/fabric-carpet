package carpet.mixins;

import carpet.CarpetServer;
import net.minecraft.server.dedicated.MinecraftDedicatedServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(MinecraftDedicatedServer.class)
public class MinecraftDedicatedServerMixin
{
    //to inject right before
    // this.tickWorlds(booleanSupplier_1);
    //@Inject(method = "setupServer", at = @At(
    //        value = "INVOKE",
    //        target = "Lnet/minecraft/server/dedicated/MinecraftDedicatedServer;loadWorld()V",
    //        shift = At.Shift.BEFORE
    //))
    //private void onSetupServer(CallbackInfoReturnable<Boolean> cir) {
    //    //CM start game hook
    //    CarpetServer.onGameStarted();
    //
    //}
}
