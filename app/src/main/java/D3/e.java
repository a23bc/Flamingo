package D3;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f1562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f1563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f1564d;

    public e(String str, HashMap map, HashSet hashSet, HashSet hashSet2) {
        this.f1561a = str;
        this.f1562b = Collections.unmodifiableMap(map);
        this.f1563c = Collections.unmodifiableSet(hashSet);
        this.f1564d = hashSet2 == null ? null : Collections.unmodifiableSet(hashSet2);
    }

    public static e a(I3.b bVar, String str) {
        int i7;
        int i8;
        int i9;
        ArrayList arrayList;
        Cursor cursorO = bVar.o("PRAGMA table_info(`" + str + "`)");
        HashMap map = new HashMap();
        try {
            if (cursorO.getColumnCount() > 0) {
                int columnIndex = cursorO.getColumnIndex("name");
                int columnIndex2 = cursorO.getColumnIndex("type");
                int columnIndex3 = cursorO.getColumnIndex("notnull");
                int columnIndex4 = cursorO.getColumnIndex("pk");
                int columnIndex5 = cursorO.getColumnIndex("dflt_value");
                while (cursorO.moveToNext()) {
                    String string = cursorO.getString(columnIndex);
                    map.put(string, new a(cursorO.getInt(columnIndex4), 2, string, cursorO.getString(columnIndex2), cursorO.getString(columnIndex5), cursorO.getInt(columnIndex3) != 0));
                }
            }
            cursorO.close();
            HashSet hashSet = new HashSet();
            cursorO = bVar.o("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int columnIndex6 = cursorO.getColumnIndex("id");
                int columnIndex7 = cursorO.getColumnIndex("seq");
                int columnIndex8 = cursorO.getColumnIndex("table");
                int columnIndex9 = cursorO.getColumnIndex("on_delete");
                int columnIndex10 = cursorO.getColumnIndex("on_update");
                ArrayList<c> arrayListB = b(cursorO);
                int count = cursorO.getCount();
                int i10 = 0;
                while (i10 < count) {
                    cursorO.moveToPosition(i10);
                    if (cursorO.getInt(columnIndex7) != 0) {
                        i7 = i10;
                        i8 = columnIndex6;
                        i9 = columnIndex7;
                        arrayList = arrayListB;
                    } else {
                        int i11 = cursorO.getInt(columnIndex6);
                        i7 = i10;
                        ArrayList arrayList2 = new ArrayList();
                        i8 = columnIndex6;
                        ArrayList arrayList3 = new ArrayList();
                        for (c cVar : arrayListB) {
                            int i12 = columnIndex7;
                            ArrayList arrayList4 = arrayListB;
                            if (cVar.f1554o == i11) {
                                arrayList2.add(cVar.f1556q);
                                arrayList3.add(cVar.f1557r);
                            }
                            columnIndex7 = i12;
                            arrayListB = arrayList4;
                        }
                        i9 = columnIndex7;
                        arrayList = arrayListB;
                        hashSet.add(new b(cursorO.getString(columnIndex8), cursorO.getString(columnIndex9), cursorO.getString(columnIndex10), arrayList2, arrayList3));
                    }
                    i10 = i7 + 1;
                    columnIndex6 = i8;
                    columnIndex7 = i9;
                    arrayListB = arrayList;
                }
                cursorO.close();
                cursorO = bVar.o("PRAGMA index_list(`" + str + "`)");
                try {
                    int columnIndex11 = cursorO.getColumnIndex("name");
                    int columnIndex12 = cursorO.getColumnIndex("origin");
                    int columnIndex13 = cursorO.getColumnIndex("unique");
                    HashSet hashSet2 = null;
                    if (columnIndex11 == -1 || columnIndex12 == -1 || columnIndex13 == -1) {
                        break;
                    }
                    HashSet hashSet3 = new HashSet();
                    while (cursorO.moveToNext()) {
                        if ("c".equals(cursorO.getString(columnIndex12))) {
                            d dVarC = c(bVar, cursorO.getString(columnIndex11), cursorO.getInt(columnIndex13) == 1);
                            if (dVarC == null) {
                                break;
                            }
                            hashSet3.add(dVarC);
                        }
                    }
                    cursorO.close();
                    hashSet2 = hashSet3;
                    return new e(str, map, hashSet, hashSet2);
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public static ArrayList b(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < count; i7++) {
            cursor.moveToPosition(i7);
            arrayList.add(new c(cursor.getString(columnIndex3), cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX WARN: Finally extract failed */
    public static d c(I3.b bVar, String str, boolean z6) {
        Cursor cursorO = bVar.o("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = cursorO.getColumnIndex("seqno");
            int columnIndex2 = cursorO.getColumnIndex("cid");
            int columnIndex3 = cursorO.getColumnIndex("name");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                TreeMap treeMap = new TreeMap();
                while (cursorO.moveToNext()) {
                    if (cursorO.getInt(columnIndex2) >= 0) {
                        treeMap.put(Integer.valueOf(cursorO.getInt(columnIndex)), cursorO.getString(columnIndex3));
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                d dVar = new d(str, z6, arrayList);
                cursorO.close();
                return dVar;
            }
            cursorO.close();
            return null;
        } catch (Throwable th) {
            cursorO.close();
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        String str = eVar.f1561a;
        String str2 = this.f1561a;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        Map map = eVar.f1562b;
        Map map2 = this.f1562b;
        if (map2 == null ? map != null : !map2.equals(map)) {
            return false;
        }
        Set set2 = eVar.f1563c;
        Set set3 = this.f1563c;
        if (set3 == null ? set2 != null : !set3.equals(set2)) {
            return false;
        }
        Set set4 = this.f1564d;
        if (set4 == null || (set = eVar.f1564d) == null) {
            return true;
        }
        return set4.equals(set);
    }

    public final int hashCode() {
        String str = this.f1561a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Map map = this.f1562b;
        int iHashCode2 = (iHashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set set = this.f1563c;
        return iHashCode2 + (set != null ? set.hashCode() : 0);
    }

    public final String toString() {
        return "TableInfo{name='" + this.f1561a + "', columns=" + this.f1562b + ", foreignKeys=" + this.f1563c + ", indices=" + this.f1564d + '}';
    }
}
