package V2;

import E4.F;
import E4.I;
import E4.b0;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f7425a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f7426b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f7427c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c4, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static C2.N a(java.lang.String r20) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: V2.d.a(java.lang.String):C2.N");
    }

    public static b0 b(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        F fO = I.o();
        String strConcat = str.concat(":Item");
        String strConcat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (AbstractC1697a.s(xmlPullParser, strConcat)) {
                String strConcat3 = str2.concat(":Mime");
                String strConcat4 = str2.concat(":Semantic");
                String strConcat5 = str2.concat(":Length");
                String strConcat6 = str2.concat(":Padding");
                String strP = AbstractC1697a.p(xmlPullParser, strConcat3);
                String strP2 = AbstractC1697a.p(xmlPullParser, strConcat4);
                String strP3 = AbstractC1697a.p(xmlPullParser, strConcat5);
                String strP4 = AbstractC1697a.p(xmlPullParser, strConcat6);
                if (strP == null || strP2 == null) {
                    return b0.f1913s;
                }
                fO.a(new b(strP3 != null ? Long.parseLong(strP3) : 0L, strP, strP4 != null ? Long.parseLong(strP4) : 0L));
            }
        } while (!AbstractC1697a.r(xmlPullParser, strConcat2));
        return fO.f();
    }
}
