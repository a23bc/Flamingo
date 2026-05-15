package androidx.lifecycle;

import f5.InterfaceC0932a;
import o5.AbstractC1267a;

/* JADX INFO: renamed from: androidx.lifecycle.o */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0592o extends Enum {
    private static final /* synthetic */ InterfaceC0932a $ENTRIES;
    private static final /* synthetic */ EnumC0592o[] $VALUES;
    public static final C0590m Companion;
    public static final EnumC0592o ON_ANY;
    public static final EnumC0592o ON_CREATE;
    public static final EnumC0592o ON_DESTROY;
    public static final EnumC0592o ON_PAUSE;
    public static final EnumC0592o ON_RESUME;
    public static final EnumC0592o ON_START;
    public static final EnumC0592o ON_STOP;

    static {
        EnumC0592o enumC0592o = new EnumC0592o("ON_CREATE", 0);
        ON_CREATE = enumC0592o;
        EnumC0592o enumC0592o2 = new EnumC0592o("ON_START", 1);
        ON_START = enumC0592o2;
        EnumC0592o enumC0592o3 = new EnumC0592o("ON_RESUME", 2);
        ON_RESUME = enumC0592o3;
        EnumC0592o enumC0592o4 = new EnumC0592o("ON_PAUSE", 3);
        ON_PAUSE = enumC0592o4;
        EnumC0592o enumC0592o5 = new EnumC0592o("ON_STOP", 4);
        ON_STOP = enumC0592o5;
        EnumC0592o enumC0592o6 = new EnumC0592o("ON_DESTROY", 5);
        ON_DESTROY = enumC0592o6;
        EnumC0592o enumC0592o7 = new EnumC0592o("ON_ANY", 6);
        ON_ANY = enumC0592o7;
        EnumC0592o[] enumC0592oArr = {enumC0592o, enumC0592o2, enumC0592o3, enumC0592o4, enumC0592o5, enumC0592o6, enumC0592o7};
        $VALUES = enumC0592oArr;
        $ENTRIES = AbstractC1267a.u(enumC0592oArr);
        Companion = new C0590m();
    }

    public static EnumC0592o valueOf(String str) {
        return (EnumC0592o) Enum.valueOf(EnumC0592o.class, str);
    }

    public static EnumC0592o[] values() {
        return (EnumC0592o[]) $VALUES.clone();
    }

    public final EnumC0593p a() {
        switch (AbstractC0591n.f9744a[ordinal()]) {
            case 1:
            case 2:
                return EnumC0593p.f9747q;
            case 3:
            case 4:
                return EnumC0593p.f9748r;
            case 5:
                return EnumC0593p.f9749s;
            case 6:
                return EnumC0593p.f9745o;
            case 7:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                throw new A2.W();
        }
    }
}
