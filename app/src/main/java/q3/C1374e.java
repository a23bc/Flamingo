package q3;

import A2.I;
import Z1.l;
import j5.AbstractC1110d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k3.m;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import w2.AbstractC1697a;
import w2.t;

/* JADX INFO: renamed from: q3.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1374e implements m {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Pattern f15547p = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Pattern f15548q = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Pattern f15549r = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Pattern f15550s = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Pattern f15551t = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Pattern f15552u = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Pattern f15553v = Pattern.compile("^(\\d+) (\\d+)$");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final C1373d f15554w = new C1373d(30.0f, 1, 1);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final XmlPullParserFactory f15555o;

    public C1374e() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f15555o = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e7) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e7);
        }
    }

    public static C1376g a(C1376g c1376g) {
        return c1376g == null ? new C1376g() : c1376g;
    }

    public static boolean b(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    public static int c(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return 15;
        }
        Matcher matcher = f15553v.matcher(attributeValue);
        if (!matcher.matches()) {
            AbstractC1697a.w("Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
        boolean z6 = true;
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i7 = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            int i8 = Integer.parseInt(strGroup2);
            if (i7 == 0 || i8 == 0) {
                z6 = false;
            }
            AbstractC1697a.c("Invalid cell resolution " + i7 + " " + i8, z6);
            return i8;
        } catch (NumberFormatException unused) {
            AbstractC1697a.w("Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
    }

    public static void e(String str, C1376g c1376g) throws k3.f {
        Matcher matcher;
        String strGroup;
        int i7 = t.f18881a;
        String[] strArrSplit = str.split("\\s+", -1);
        int length = strArrSplit.length;
        Pattern pattern = f15549r;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (strArrSplit.length != 2) {
                throw new k3.f("Invalid number of entries for fontSize: " + strArrSplit.length + ".");
            }
            matcher = pattern.matcher(strArrSplit[1]);
            AbstractC1697a.w("Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new k3.f(l.q("Invalid expression for fontSize: '", str, "'."));
        }
        strGroup = matcher.group(3);
        strGroup.getClass();
        switch (strGroup) {
            case "%":
                c1376g.f15573j = 3;
                break;
            case "em":
                c1376g.f15573j = 2;
                break;
            case "px":
                c1376g.f15573j = 1;
                break;
            default:
                throw new k3.f(l.q("Invalid unit for fontSize: '", strGroup, "'."));
        }
        String strGroup2 = matcher.group(1);
        strGroup2.getClass();
        c1376g.f15574k = Float.parseFloat(strGroup2);
    }

    public static C1373d f(XmlPullParser xmlPullParser) {
        float f7;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i7 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i8 = t.f18881a;
            AbstractC1697a.c("frameRateMultiplier doesn't have 2 parts", attributeValue2.split(" ", -1).length == 2);
            f7 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f7 = 1.0f;
        }
        C1373d c1373d = f15554w;
        int i9 = c1373d.f15545b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i9 = Integer.parseInt(attributeValue3);
        }
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        return new C1373d(i7 * f7, i9, attributeValue4 != null ? Integer.parseInt(attributeValue4) : c1373d.f15546c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:105:0x024a A[LOOP:0: B:3:0x000a->B:105:0x024a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0249 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void g(org.xmlpull.v1.XmlPullParser r20, java.util.HashMap r21, int r22, B2.m r23, java.util.HashMap r24, java.util.HashMap r25) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 614
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q3.C1374e.g(org.xmlpull.v1.XmlPullParser, java.util.HashMap, int, B2.m, java.util.HashMap, java.util.HashMap):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static q3.C1372c h(org.xmlpull.v1.XmlPullParser r23, q3.C1372c r24, java.util.HashMap r25, q3.C1373d r26) throws k3.f {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q3.C1374e.h(org.xmlpull.v1.XmlPullParser, q3.c, java.util.HashMap, q3.d):q3.c");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:240:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0030  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:217)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:68)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:71)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:125)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static q3.C1376g j(org.xmlpull.v1.XmlPullParser r19, q3.C1376g r20) {
        /*
            Method dump skipped, instruction units count: 1582
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q3.C1374e.j(org.xmlpull.v1.XmlPullParser, q3.g):q3.g");
    }

    public static long k(String str, C1373d c1373d) throws k3.f {
        double d4;
        double d7;
        double d8;
        Matcher matcher = f15547p.matcher(str);
        if (matcher.matches()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            double d9 = Long.parseLong(strGroup) * 3600;
            matcher.group(2).getClass();
            double d10 = d9 + (Long.parseLong(r13) * 60);
            matcher.group(3).getClass();
            double d11 = d10 + Long.parseLong(r13);
            String strGroup2 = matcher.group(4);
            return (long) ((d11 + (strGroup2 != null ? Double.parseDouble(strGroup2) : 0.0d) + (matcher.group(5) != null ? Long.parseLong(r13) / c1373d.f15544a : 0.0d) + (matcher.group(6) != null ? (Long.parseLong(r13) / ((double) c1373d.f15545b)) / ((double) c1373d.f15544a) : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = f15548q.matcher(str);
        if (!matcher2.matches()) {
            throw new k3.f("Malformed time expression: " + str);
        }
        String strGroup3 = matcher2.group(1);
        strGroup3.getClass();
        d4 = Double.parseDouble(strGroup3);
        String strGroup4 = matcher2.group(2);
        strGroup4.getClass();
        switch (strGroup4) {
            case "f":
                d7 = c1373d.f15544a;
                d4 /= d7;
                return (long) (d4 * 1000000.0d);
            case "h":
                d8 = 3600.0d;
                break;
            case "m":
                d8 = 60.0d;
                break;
            case "t":
                d7 = c1373d.f15546c;
                d4 /= d7;
                return (long) (d4 * 1000000.0d);
            case "ms":
                d7 = 1000.0d;
                d4 /= d7;
                return (long) (d4 * 1000000.0d);
            default:
                return (long) (d4 * 1000000.0d);
        }
        d4 *= d8;
        return (long) (d4 * 1000000.0d);
    }

    public static B2.m m(XmlPullParser xmlPullParser) {
        String strP = AbstractC1697a.p(xmlPullParser, "extent");
        if (strP == null) {
            return null;
        }
        Matcher matcher = f15552u.matcher(strP);
        if (!matcher.matches()) {
            AbstractC1697a.w("Ignoring non-pixel tts extent: ".concat(strP));
            return null;
        }
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i7 = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            return new B2.m(i7, Integer.parseInt(strGroup2));
        } catch (NumberFormatException unused) {
            AbstractC1697a.w("Ignoring malformed tts extent: ".concat(strP));
            return null;
        }
    }

    @Override // k3.m
    public final /* synthetic */ void d() {
    }

    @Override // k3.m
    public final k3.d i(byte[] bArr, int i7, int i8) {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f15555o.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new C1375f("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            B2.m mVarM = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i7, i8), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            C1373d c1373dF = f15554w;
            int i9 = 0;
            int iC = 15;
            F5.t tVar = null;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                C1372c c1372c = (C1372c) arrayDeque.peek();
                if (i9 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            c1373dF = f(xmlPullParserNewPullParser);
                            iC = c(xmlPullParserNewPullParser);
                            mVarM = m(xmlPullParserNewPullParser);
                        }
                        C1373d c1373d = c1373dF;
                        B2.m mVar = mVarM;
                        int i10 = iC;
                        if (b(name)) {
                            if ("head".equals(name)) {
                                g(xmlPullParserNewPullParser, map, i10, mVar, map2, map3);
                            } else {
                                try {
                                    C1372c c1372cH = h(xmlPullParserNewPullParser, c1372c, map2, c1373d);
                                    arrayDeque.push(c1372cH);
                                    if (c1372c != null) {
                                        if (c1372c.f15543m == null) {
                                            c1372c.f15543m = new ArrayList();
                                        }
                                        c1372c.f15543m.add(c1372cH);
                                    }
                                } catch (k3.f e7) {
                                    AbstractC1697a.x("Suppressing parser error", e7);
                                    i9++;
                                }
                            }
                            iC = i10;
                            mVarM = mVar;
                            c1373dF = c1373d;
                        } else {
                            AbstractC1697a.q("Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                        }
                        i9++;
                        iC = i10;
                        mVarM = mVar;
                        c1373dF = c1373d;
                    } else if (eventType == 4) {
                        c1372c.getClass();
                        C1372c c1372cA = C1372c.a(xmlPullParserNewPullParser.getText());
                        if (c1372c.f15543m == null) {
                            c1372c.f15543m = new ArrayList();
                        }
                        c1372c.f15543m.add(c1372cA);
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals("tt")) {
                            C1372c c1372c2 = (C1372c) arrayDeque.peek();
                            c1372c2.getClass();
                            tVar = new F5.t(c1372c2, map, map2, map3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i9++;
                } else if (eventType == 3) {
                    i9--;
                }
                xmlPullParserNewPullParser.next();
            }
            tVar.getClass();
            return tVar;
        } catch (IOException e8) {
            throw new IllegalStateException("Unexpected error when reading input.", e8);
        } catch (XmlPullParserException e9) {
            throw new IllegalStateException("Unable to decode source", e9);
        }
    }

    @Override // k3.m
    public final void l(byte[] bArr, int i7, int i8, k3.l lVar, w2.c cVar) {
        AbstractC1110d.H(i(bArr, i7, i8), lVar, cVar);
    }

    @Override // k3.m
    public final /* synthetic */ void r(byte[] bArr, k3.l lVar, I i7) {
        l.d(this, bArr, lVar, i7);
    }

    @Override // k3.m
    public final int s() {
        return 1;
    }
}
