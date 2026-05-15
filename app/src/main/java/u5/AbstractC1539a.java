package u5;

import java.nio.charset.Charset;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: u5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1539a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f17313a;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        AbstractC1209k.e(charsetForName, "forName(...)");
        f17313a = charsetForName;
        AbstractC1209k.e(Charset.forName("UTF-16"), "forName(...)");
        AbstractC1209k.e(Charset.forName("UTF-16BE"), "forName(...)");
        AbstractC1209k.e(Charset.forName("UTF-16LE"), "forName(...)");
        AbstractC1209k.e(Charset.forName("US-ASCII"), "forName(...)");
        AbstractC1209k.e(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
