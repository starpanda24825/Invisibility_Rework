package com.starpanda.invisibilityrework.mixin;

import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.world.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LivingEntityRenderer.class)
public abstract class MixinLivingEntityRenderer {

    @Inject(method = "isBodyVisible", at = @At("HEAD"), cancellable = true)
    private <T extends LivingEntity> void invisibilityrework$forceBodyVisible(T livingEntity, CallbackInfoReturnable<Boolean> cri) {
        cri.setReturnValue(true);
    }

    @Redirect(
        method = "shouldShowName",
        at = @At(
            value = "INVOKE",
            target = "Lnet/minecraft/world/entity/LivingEntity;isInvisible()Z"
        )
    )
    private boolean invisibilityrework$skipInvisibilityNameCheck(LivingEntity entity) {
        return false;
    }
}
