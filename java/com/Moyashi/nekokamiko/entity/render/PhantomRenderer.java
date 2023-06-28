package com.Moyashi.nekokamiko.entity.render;


import com.Moyashi.nekokamiko.entity.PhantomHunter;
import com.Moyashi.nekokamiko.entity.SilverHunter;
import com.Moyashi.nekokamiko.entity.model.HunterModels;
import com.Moyashi.nekokamiko.entity.model.PhantomModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "nekokamiko", bus = Mod.EventBusSubscriber.Bus.MOD)

public class PhantomRenderer extends MobRenderer<PhantomHunter, PhantomModel<PhantomHunter>> {
    private static final ResourceLocation TEXTURE = new ResourceLocation("nekokamiko", "textures/entity/mob/kurohuku.png");

    public PhantomRenderer(EntityRendererManager renderManager) {
        super(renderManager, new PhantomModel<>(), 0.5F);
    }

    @Override
    public ResourceLocation getTextureLocation(PhantomHunter entity) {
        return TEXTURE;
    }
}