package d;

import A2.k0;
import a.AbstractC0509a;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import g.C0934a;
import g.C0936c;
import g.C0937d;
import g.C0938e;
import g.C0940g;
import g.InterfaceC0935b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import m5.AbstractC1209k;
import t5.C1517a;
import t5.C1523g;
import u1.InterfaceC1529a;

/* JADX INFO: renamed from: d.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0757j {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f10768a = new LinkedHashMap();

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f10769b = new LinkedHashMap();

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap f10770c = new LinkedHashMap();

    /* JADX INFO: renamed from: d */
    public final ArrayList f10771d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final transient LinkedHashMap f10772e = new LinkedHashMap();

    /* JADX INFO: renamed from: f */
    public final LinkedHashMap f10773f = new LinkedHashMap();

    /* JADX INFO: renamed from: g */
    public final Bundle f10774g = new Bundle();
    public final /* synthetic */ AbstractActivityC0759l h;

    public C0757j(AbstractActivityC0759l abstractActivityC0759l) {
        this.h = abstractActivityC0759l;
    }

    public final boolean a(int i7, int i8, Intent intent) {
        String str = (String) this.f10768a.get(Integer.valueOf(i7));
        if (str == null) {
            return false;
        }
        C0936c c0936c = (C0936c) this.f10772e.get(str);
        if ((c0936c != null ? c0936c.f12252a : null) != null) {
            ArrayList arrayList = this.f10771d;
            if (arrayList.contains(str)) {
                c0936c.f12252a.d(c0936c.f12253b.T(intent, i8));
                arrayList.remove(str);
                return true;
            }
        }
        this.f10773f.remove(str);
        this.f10774g.putParcelable(str, new C0934a(intent, i8));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void b(int i7, AbstractC0509a abstractC0509a, Cloneable cloneable) {
        Bundle bundleExtra;
        int i8;
        AbstractActivityC0759l abstractActivityC0759l = this.h;
        U0.a aVarH = abstractC0509a.H(abstractActivityC0759l, cloneable);
        if (aVarH != null) {
            new Handler(Looper.getMainLooper()).post(new k0(this, i7, aVarH, 3));
            return;
        }
        Intent intentR = abstractC0509a.r(abstractActivityC0759l, cloneable);
        if (intentR.getExtras() != null) {
            Bundle extras = intentR.getExtras();
            AbstractC1209k.c(extras);
            if (extras.getClassLoader() == null) {
                intentR.setExtrasClassLoader(abstractActivityC0759l.getClassLoader());
            }
        }
        if (intentR.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundleExtra = intentR.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentR.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundleExtra = null;
        }
        Bundle bundle = bundleExtra;
        if (!"androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentR.getAction())) {
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentR.getAction())) {
                abstractActivityC0759l.startActivityForResult(intentR, i7, bundle);
                return;
            }
            C0940g c0940g = (C0940g) intentR.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                AbstractC1209k.c(c0940g);
                i8 = i7;
            } catch (IntentSender.SendIntentException e7) {
                e = e7;
                i8 = i7;
            }
            try {
                abstractActivityC0759l.startIntentSenderForResult(c0940g.f12258o, i8, c0940g.f12259p, c0940g.f12260q, c0940g.f12261r, 0, bundle);
                return;
            } catch (IntentSender.SendIntentException e8) {
                e = e8;
                new Handler(Looper.getMainLooper()).post(new k0(this, i8, e, 4));
                return;
            }
        }
        String[] stringArrayExtra = intentR.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        if (stringArrayExtra == null) {
            stringArrayExtra = new String[0];
        }
        HashSet hashSet = new HashSet();
        for (int i9 = 0; i9 < stringArrayExtra.length; i9++) {
            if (TextUtils.isEmpty(stringArrayExtra[i9])) {
                throw new IllegalArgumentException(Z1.l.t(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i9], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i9));
            }
        }
        int size = hashSet.size();
        String[] strArr = size > 0 ? new String[stringArrayExtra.length - size] : stringArrayExtra;
        if (size > 0) {
            if (size == stringArrayExtra.length) {
                return;
            }
            int i10 = 0;
            for (int i11 = 0; i11 < stringArrayExtra.length; i11++) {
                if (!hashSet.contains(Integer.valueOf(i11))) {
                    strArr[i10] = stringArrayExtra[i11];
                    i10++;
                }
            }
        }
        if (abstractActivityC0759l instanceof InterfaceC1529a) {
        }
        abstractActivityC0759l.requestPermissions(stringArrayExtra, i7);
    }

    public final C0938e c(String str, AbstractC0509a abstractC0509a, InterfaceC0935b interfaceC0935b) {
        Object parcelable;
        AbstractC1209k.f(str, "key");
        LinkedHashMap linkedHashMap = this.f10769b;
        if (((Integer) linkedHashMap.get(str)) == null) {
            for (Number number : new C1517a(new C1523g(C0937d.f12254p, new t5.m(1, 1)))) {
                int iIntValue = number.intValue();
                LinkedHashMap linkedHashMap2 = this.f10768a;
                if (!linkedHashMap2.containsKey(Integer.valueOf(iIntValue))) {
                    int iIntValue2 = number.intValue();
                    linkedHashMap2.put(Integer.valueOf(iIntValue2), str);
                    linkedHashMap.put(str, Integer.valueOf(iIntValue2));
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
        this.f10772e.put(str, new C0936c(interfaceC0935b, abstractC0509a));
        LinkedHashMap linkedHashMap3 = this.f10773f;
        if (linkedHashMap3.containsKey(str)) {
            Object obj = linkedHashMap3.get(str);
            linkedHashMap3.remove(str);
            interfaceC0935b.d(obj);
        }
        int i7 = Build.VERSION.SDK_INT;
        Bundle bundle = this.f10774g;
        if (i7 >= 34) {
            parcelable = B1.c.a(str, bundle);
        } else {
            parcelable = bundle.getParcelable(str);
            if (!C0934a.class.isInstance(parcelable)) {
                parcelable = null;
            }
        }
        C0934a c0934a = (C0934a) parcelable;
        if (c0934a != null) {
            bundle.remove(str);
            interfaceC0935b.d(abstractC0509a.T(c0934a.f12251p, c0934a.f12250o));
        }
        return new C0938e(this, str, abstractC0509a);
    }
}
