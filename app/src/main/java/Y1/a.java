package Y1;

import d2.C0821i;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a */
    public final ArrayList f8562a;

    /* JADX INFO: renamed from: b */
    public int f8563b;

    /* JADX INFO: renamed from: c */
    public int f8564c;

    /* JADX INFO: renamed from: d */
    public int f8565d;

    /* JADX INFO: renamed from: e */
    public int f8566e;

    /* JADX INFO: renamed from: f */
    public int f8567f;

    /* JADX INFO: renamed from: g */
    public boolean f8568g;
    public String h;

    /* JADX INFO: renamed from: i */
    public int f8569i;

    /* JADX INFO: renamed from: j */
    public CharSequence f8570j;

    /* JADX INFO: renamed from: k */
    public int f8571k;
    public CharSequence l;

    /* JADX INFO: renamed from: m */
    public ArrayList f8572m;

    /* JADX INFO: renamed from: n */
    public ArrayList f8573n;

    /* JADX INFO: renamed from: o */
    public boolean f8574o;

    /* JADX INFO: renamed from: p */
    public final q f8575p;

    /* JADX INFO: renamed from: q */
    public int f8576q;

    public a(q qVar) {
        n nVar = qVar.f8641t;
        g gVar = qVar.f8639r;
        if (gVar != null) {
            gVar.f8597o.getClassLoader();
        }
        this.f8562a = new ArrayList();
        this.f8574o = false;
        this.f8576q = -1;
        this.f8575p = qVar;
    }

    public final void a() {
        if (this.f8568g) {
            if (q.h(2)) {
                toString();
            }
            ArrayList arrayList = this.f8562a;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((v) arrayList.get(i7)).getClass();
            }
        }
    }

    public final void b(String str, PrintWriter printWriter, boolean z6) {
        String str2;
        if (z6) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.h);
            printWriter.print(" mIndex=");
            printWriter.print(this.f8576q);
            printWriter.print(" mCommitted=");
            printWriter.println(false);
            if (this.f8567f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f8567f));
            }
            if (this.f8563b != 0 || this.f8564c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f8563b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f8564c));
            }
            if (this.f8565d != 0 || this.f8566e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f8565d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f8566e));
            }
            if (this.f8569i != 0 || this.f8570j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f8569i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f8570j);
            }
            if (this.f8571k != 0 || this.l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f8571k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.l);
            }
        }
        ArrayList arrayList = this.f8562a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            v vVar = (v) arrayList.get(i7);
            switch (vVar.f8676a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + vVar.f8676a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i7);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println((Object) null);
            if (z6) {
                if (vVar.f8678c != 0 || vVar.f8679d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(vVar.f8678c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(vVar.f8679d));
                }
                if (vVar.f8680e != 0 || vVar.f8681f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(vVar.f8680e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(vVar.f8681f));
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f8576q >= 0) {
            sb.append(" #");
            sb.append(this.f8576q);
        }
        if (this.h != null) {
            sb.append(" ");
            sb.append(this.h);
        }
        sb.append("}");
        return sb.toString();
    }
}
