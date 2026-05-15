package o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import j.AbstractC1089a;
import j5.AbstractC1109c;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import p.o;
import q.AbstractC1322k0;

/* JADX INFO: loaded from: classes.dex */
public final class h extends MenuInflater {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Class[] f14607e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Class[] f14608f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f14609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f14610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f14611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f14612d;

    static {
        Class[] clsArr = {Context.class};
        f14607e = clsArr;
        f14608f = clsArr;
    }

    public h(Context context) {
        super(context);
        this.f14611c = context;
        Object[] objArr = {context};
        this.f14609a = objArr;
        this.f14610b = objArr;
    }

    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [o.h] */
    /* JADX WARN: Type inference failed for: r3v15, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v59 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        ?? r42;
        int i7;
        XmlResourceParser xmlResourceParser2;
        ?? r8;
        ColorStateList colorStateList;
        int resourceId;
        g gVar = new g(this, menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            r42 = 1;
            i7 = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlResourceParser.next();
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z6 = false;
        boolean z7 = false;
        String str = null;
        while (!z6) {
            if (eventType == r42) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i7) {
                if (eventType != 3) {
                    xmlResourceParser2 = xmlResourceParser;
                    r8 = r42;
                    z6 = z6;
                } else {
                    String name2 = xmlResourceParser.getName();
                    if (z7 && name2.equals(str)) {
                        xmlResourceParser2 = xmlResourceParser;
                        r8 = r42;
                        z7 = false;
                        str = null;
                    } else {
                        if (name2.equals("group")) {
                            gVar.f14584b = 0;
                            gVar.f14585c = 0;
                            gVar.f14586d = 0;
                            gVar.f14587e = 0;
                            gVar.f14588f = r42;
                            gVar.f14589g = r42;
                        } else if (name2.equals("item")) {
                            if (!gVar.h) {
                                o oVar = gVar.f14606z;
                                if (oVar == null || !oVar.f14868b.hasSubMenu()) {
                                    gVar.h = r42;
                                    gVar.b(gVar.f14583a.add(gVar.f14584b, gVar.f14590i, gVar.f14591j, gVar.f14592k));
                                } else {
                                    gVar.h = r42;
                                    gVar.b(gVar.f14583a.addSubMenu(gVar.f14584b, gVar.f14590i, gVar.f14591j, gVar.f14592k).getItem());
                                }
                            }
                        } else if (name2.equals("menu")) {
                            xmlResourceParser2 = xmlResourceParser;
                            ?? r82 = r42;
                            z6 = r82 == true ? 1 : 0;
                            r8 = r82;
                        }
                        xmlResourceParser2 = xmlResourceParser;
                        r8 = r42;
                        z6 = z6;
                    }
                }
                eventType = xmlResourceParser2.next();
                r42 = r8;
                i7 = 2;
                z6 = z6;
                z7 = z7;
            } else {
                if (!z7) {
                    String name3 = xmlResourceParser.getName();
                    boolean zEquals = name3.equals("group");
                    h hVar = gVar.f14582E;
                    if (zEquals) {
                        ?? ObtainStyledAttributes = hVar.f14611c.obtainStyledAttributes(attributeSet, AbstractC1089a.f13607p);
                        gVar.f14584b = ObtainStyledAttributes.getResourceId(r42, 0);
                        gVar.f14585c = ObtainStyledAttributes.getInt(3, 0);
                        gVar.f14586d = ObtainStyledAttributes.getInt(4, 0);
                        gVar.f14587e = ObtainStyledAttributes.getInt(5, 0);
                        gVar.f14588f = ObtainStyledAttributes.getBoolean(2, r42);
                        gVar.f14589g = ObtainStyledAttributes.getBoolean(0, r42);
                        ObtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            Context context = hVar.f14611c;
                            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1089a.f13608q);
                            gVar.f14590i = typedArrayObtainStyledAttributes.getResourceId(2, 0);
                            gVar.f14591j = (typedArrayObtainStyledAttributes.getInt(5, gVar.f14585c) & (-65536)) | (typedArrayObtainStyledAttributes.getInt(6, gVar.f14586d) & 65535);
                            gVar.f14592k = typedArrayObtainStyledAttributes.getText(7);
                            gVar.l = typedArrayObtainStyledAttributes.getText(8);
                            gVar.f14593m = typedArrayObtainStyledAttributes.getResourceId(0, 0);
                            String string = typedArrayObtainStyledAttributes.getString(9);
                            gVar.f14594n = string == null ? (char) 0 : string.charAt(0);
                            gVar.f14595o = typedArrayObtainStyledAttributes.getInt(16, 4096);
                            String string2 = typedArrayObtainStyledAttributes.getString(10);
                            gVar.f14596p = string2 == null ? (char) 0 : string2.charAt(0);
                            gVar.f14597q = typedArrayObtainStyledAttributes.getInt(20, 4096);
                            if (typedArrayObtainStyledAttributes.hasValue(11)) {
                                gVar.f14598r = typedArrayObtainStyledAttributes.getBoolean(11, false) ? 1 : 0;
                            } else {
                                gVar.f14598r = gVar.f14587e;
                            }
                            gVar.f14599s = typedArrayObtainStyledAttributes.getBoolean(3, false);
                            gVar.f14600t = typedArrayObtainStyledAttributes.getBoolean(4, gVar.f14588f);
                            gVar.f14601u = typedArrayObtainStyledAttributes.getBoolean(1, gVar.f14589g);
                            gVar.f14602v = typedArrayObtainStyledAttributes.getInt(21, -1);
                            gVar.f14605y = typedArrayObtainStyledAttributes.getString(12);
                            gVar.f14603w = typedArrayObtainStyledAttributes.getResourceId(13, 0);
                            gVar.f14604x = typedArrayObtainStyledAttributes.getString(15);
                            String string3 = typedArrayObtainStyledAttributes.getString(14);
                            if (string3 != null && gVar.f14603w == 0 && gVar.f14604x == null) {
                                gVar.f14606z = (o) gVar.a(string3, f14608f, hVar.f14610b);
                            } else {
                                gVar.f14606z = null;
                            }
                            gVar.f14578A = typedArrayObtainStyledAttributes.getText(17);
                            gVar.f14579B = typedArrayObtainStyledAttributes.getText(22);
                            if (typedArrayObtainStyledAttributes.hasValue(19)) {
                                gVar.f14581D = AbstractC1322k0.b(typedArrayObtainStyledAttributes.getInt(19, -1), gVar.f14581D);
                            } else {
                                gVar.f14581D = null;
                            }
                            if (typedArrayObtainStyledAttributes.hasValue(18)) {
                                if (!typedArrayObtainStyledAttributes.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(18, 0)) == 0 || (colorStateList = AbstractC1109c.r(context, resourceId)) == null) {
                                    colorStateList = typedArrayObtainStyledAttributes.getColorStateList(18);
                                }
                                gVar.f14580C = colorStateList;
                            } else {
                                gVar.f14580C = null;
                            }
                            typedArrayObtainStyledAttributes.recycle();
                            gVar.h = false;
                            xmlResourceParser2 = xmlResourceParser;
                            r8 = 1;
                        } else if (name3.equals("menu")) {
                            r8 = 1;
                            gVar.h = true;
                            SubMenu subMenuAddSubMenu = gVar.f14583a.addSubMenu(gVar.f14584b, gVar.f14590i, gVar.f14591j, gVar.f14592k);
                            gVar.b(subMenuAddSubMenu.getItem());
                            xmlResourceParser2 = xmlResourceParser;
                            b(xmlResourceParser2, attributeSet, subMenuAddSubMenu);
                        } else {
                            xmlResourceParser2 = xmlResourceParser;
                            r8 = 1;
                            str = name3;
                            z7 = true;
                        }
                        eventType = xmlResourceParser2.next();
                        r42 = r8;
                        i7 = 2;
                        z6 = z6;
                        z7 = z7;
                    }
                }
                xmlResourceParser2 = xmlResourceParser;
                r8 = r42;
                z6 = z6;
            }
            eventType = xmlResourceParser2.next();
            r42 = r8;
            i7 = 2;
            z6 = z6;
            z7 = z7;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i7, Menu menu) {
        if (!(menu instanceof p.l)) {
            super.inflate(i7, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z6 = false;
        try {
            try {
                layout = this.f14611c.getResources().getLayout(i7);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof p.l) {
                    p.l lVar = (p.l) menu;
                    if (!lVar.f14828p) {
                        lVar.w();
                        z6 = true;
                    }
                }
                b(layout, attributeSetAsAttributeSet, menu);
                if (z6) {
                    ((p.l) menu).v();
                }
                layout.close();
            } catch (IOException e7) {
                throw new InflateException("Error inflating menu XML", e7);
            } catch (XmlPullParserException e8) {
                throw new InflateException("Error inflating menu XML", e8);
            }
        } catch (Throwable th) {
            if (z6) {
                ((p.l) menu).v();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
