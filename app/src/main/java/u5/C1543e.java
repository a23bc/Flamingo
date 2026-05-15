package u5;

import java.io.Serializable;
import java.util.regex.Pattern;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: u5.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1543e implements Serializable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Pattern f17323o;

    public C1543e(String str) {
        Pattern patternCompile = Pattern.compile(str);
        AbstractC1209k.e(patternCompile, "compile(...)");
        this.f17323o = patternCompile;
    }

    public final String toString() {
        String string = this.f17323o.toString();
        AbstractC1209k.e(string, "toString(...)");
        return string;
    }
}
