// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class GameObject extends Renderable {

    public int anInt1467;
    public boolean aBoolean1468;
    public final int objectId;
    public final int type;
    public final int orientation;
    public final int minX;
    public final int minY;
    public final int maxX;
    public final int maxY;
    public Class26 animation;
    public int frame;
    public int nextFrameTime;
    public GameObject(int type, int orientation, int k, int objectId, int maxX, int j1, boolean animating,
                      int minY, int maxY, int minX) {
        aBoolean1468 = false;
        this.objectId = objectId;
        this.type = type;
        this.orientation = orientation;
        this.minX = minX;
        this.minY = minY;
        this.maxX = maxX;
        this.maxY = maxY;
        animation = Class26.aClass26Array497[k];
        frame = 0;
        nextFrameTime = Client.tick;
        if (j1 != 0)
            anInt1467 = 429;
        if (animating && animation.frameStep != -1) {
            frame = (int) (Math.random() * (double) animation.anInt498);
            nextFrameTime -= (int) (Math.random() * (double) animation.getFrameLength(frame, 41645));
        }
    }

    public Model getModel(boolean flag) {
        if (animation != null) {
            int step = Client.tick - nextFrameTime;
            if (step > 100 && animation.frameStep > 0)
                step = 100;
            while (step > animation.getFrameLength(frame, 41645)) {
                step -= animation.getFrameLength(frame, 41645);
                frame++;
                if (frame < animation.anInt498)
                    continue;
                frame -= animation.frameStep;
                if (frame >= 0 && frame < animation.anInt498)
                    continue;
                animation = null;
                break;
            }
            nextFrameTime = Client.tick - step;
        }
        int animationId = -1;
        if (flag)
            aBoolean1468 = !aBoolean1468;
        if (animation != null)
            animationId = animation.primaryFrames[frame];
        GameObjectDefinition definition = GameObjectDefinition.get(objectId);
        return definition.getModel(type, orientation, minX, minY, maxX, maxY, animationId );
    }
}
