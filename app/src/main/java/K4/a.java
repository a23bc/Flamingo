package K4;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public enum a extends h {
    public a() {
        super("IDENTITY", 0);
    }

    @Override // K4.h
    public final String b(Field field) {
        return field.getName();
    }
}
