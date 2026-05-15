package com.tencent.mmkv;

import S4.a;
import S4.b;
import Z1.l;
import android.content.SharedPreferences;
import dalvik.annotation.optimization.FastNative;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import yos.music.player.YosBasicApplication;

/* JADX INFO: loaded from: classes.dex */
public class MMKV implements SharedPreferences, SharedPreferences.Editor {

    /* JADX INFO: renamed from: a */
    public static final EnumMap f10713a;

    /* JADX INFO: renamed from: b */
    public static final EnumMap f10714b;

    /* JADX INFO: renamed from: c */
    public static final a[] f10715c;

    /* JADX INFO: renamed from: d */
    public static final HashSet f10716d;

    /* JADX INFO: renamed from: e */
    public static String f10717e;

    /* JADX INFO: renamed from: f */
    public static boolean f10718f;
    private final long nativeHandle;

    static {
        EnumMap enumMap = new EnumMap(b.class);
        f10713a = enumMap;
        enumMap.put(b.f6753o, 0);
        enumMap.put(b.f6754p, 1);
        EnumMap enumMap2 = new EnumMap(a.class);
        f10714b = enumMap2;
        a aVar = a.f6747o;
        enumMap2.put(aVar, 0);
        a aVar2 = a.f6748p;
        enumMap2.put(aVar2, 1);
        a aVar3 = a.f6749q;
        enumMap2.put(aVar3, 2);
        a aVar4 = a.f6750r;
        enumMap2.put(aVar4, 3);
        a aVar5 = a.f6751s;
        enumMap2.put(aVar5, 4);
        f10715c = new a[]{aVar, aVar2, aVar3, aVar4, aVar5};
        f10716d = new HashSet();
        f10717e = null;
        f10718f = true;
        new HashMap();
    }

    public MMKV(long j3) {
        this.nativeHandle = j3;
    }

    private native long actualSize(long j3);

    private native String[] allKeys(long j3, boolean z6);

    public static native long backupAllToDirectory(String str);

    public static native boolean backupOneToDirectory(String str, String str2, String str3);

    private static native boolean checkProcessMode(long j3);

    private native boolean containsKey(long j3, String str);

    private native long count(long j3, boolean z6);

    private static native long createNB(int i7);

    private native boolean decodeBool(long j3, String str, boolean z6);

    private native byte[] decodeBytes(long j3, String str);

    private native double decodeDouble(long j3, String str, double d4);

    private native float decodeFloat(long j3, String str, float f7);

    private native int decodeInt(long j3, String str, int i7);

    private native long decodeLong(long j3, String str, long j7);

    private native String decodeString(long j3, String str, String str2);

    private native String[] decodeStringSet(long j3, String str);

    private static native void destroyNB(long j3, int i7);

    private native boolean encodeBool(long j3, String str, boolean z6);

    private native boolean encodeBool_2(long j3, String str, boolean z6, int i7);

    private native boolean encodeBytes(long j3, String str, byte[] bArr);

    private native boolean encodeBytes_2(long j3, String str, byte[] bArr, int i7);

    private native boolean encodeDouble(long j3, String str, double d4);

    private native boolean encodeDouble_2(long j3, String str, double d4, int i7);

    private native boolean encodeFloat(long j3, String str, float f7);

    private native boolean encodeFloat_2(long j3, String str, float f7, int i7);

    private native boolean encodeInt(long j3, String str, int i7);

    private native boolean encodeInt_2(long j3, String str, int i7, int i8);

    private native boolean encodeLong(long j3, String str, long j7);

    private native boolean encodeLong_2(long j3, String str, long j7, int i7);

    private native boolean encodeSet(long j3, String str, String[] strArr);

    private native boolean encodeSet_2(long j3, String str, String[] strArr, int i7);

    private native boolean encodeString(long j3, String str, String str2);

    private native boolean encodeString_2(long j3, String str, String str2, int i7);

    private static native long getDefaultMMKV(int i7, String str);

    private static native long getMMKVWithAshmemFD(String str, int i7, int i8, String str2);

    private static native long getMMKVWithID(String str, int i7, String str2, String str3, long j3);

    private static native long getMMKVWithIDAndSize(String str, int i7, int i8, String str2);

    public static void h() {
        synchronized (f10716d) {
            f10718f = true;
        }
    }

    private native boolean isCompareBeforeSetEnabled();

    @FastNative
    private native boolean isEncryptionEnabled();

    @FastNative
    private native boolean isExpirationEnabled();

    public static native boolean isFileValid(String str, String str2);

    private static native void jniInitialize(String str, String str2, int i7, boolean z6);

    private static void mmkvLogImp(int i7, String str, int i8, String str2, String str3) {
        f10715c[i7].ordinal();
    }

    @FastNative
    private native void nativeEnableCompareBeforeSet();

    public static void o(YosBasicApplication yosBasicApplication) {
        String str = yosBasicApplication.getFilesDir().getAbsolutePath() + "/mmkv";
        if ((yosBasicApplication.getApplicationInfo().flags & 2) == 0) {
            synchronized (f10716d) {
                f10718f = false;
            }
        } else {
            h();
        }
        String absolutePath = yosBasicApplication.getCacheDir().getAbsolutePath();
        System.loadLibrary("mmkv");
        jniInitialize(str, absolutePath, 1, false);
        f10717e = str;
    }

    private static void onContentChangedByOuterProcess(String str) {
    }

    public static native void onExit();

    private static int onMMKVCRCCheckFail(String str) {
        b bVar = b.f6753o;
        r("Recover strategic for " + str + " is " + bVar);
        Integer num = (Integer) f10713a.get(bVar);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    private static int onMMKVFileLengthError(String str) {
        b bVar = b.f6753o;
        r("Recover strategic for " + str + " is " + bVar);
        Integer num = (Integer) f10713a.get(bVar);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static MMKV p(String str) {
        if (f10717e == null) {
            throw new IllegalStateException("You should Call MMKV.initialize() first.");
        }
        long mMKVWithID = getMMKVWithID(str, 1, null, null, 0L);
        if (mMKVWithID == 0) {
            throw new RuntimeException(l.q("Fail to create an MMKV instance [", str, "] in JNI"));
        }
        if (!f10718f) {
            return new MMKV(mMKVWithID);
        }
        HashSet hashSet = f10716d;
        synchronized (hashSet) {
            try {
                if (!hashSet.contains(Long.valueOf(mMKVWithID))) {
                    if (!checkProcessMode(mMKVWithID)) {
                        throw new IllegalArgumentException("Opening a multi-process MMKV instance [" + str + "] with SINGLE_PROCESS_MODE!");
                    }
                    hashSet.add(Long.valueOf(mMKVWithID));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return new MMKV(mMKVWithID);
    }

    public static native int pageSize();

    public static void r(String str) {
        a aVar = a.f6748p;
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[r1.length - 1];
        Integer num = (Integer) f10714b.get(aVar);
        mmkvLogImp(num == null ? 0 : num.intValue(), stackTraceElement.getFileName(), stackTraceElement.getLineNumber(), stackTraceElement.getMethodName(), str);
    }

    public static native boolean removeStorage(String str, String str2);

    private native void removeValueForKey(long j3, String str);

    public static native long restoreAllFromDirectory(String str);

    public static native boolean restoreOneMMKVFromDirectory(String str, String str2, String str3);

    private static native void setCallbackHandler(boolean z6, boolean z7);

    private static native void setLogLevel(int i7);

    private static native void setWantsContentChangeNotify(boolean z6);

    private native void sync(boolean z6);

    private native long totalSize(long j3);

    private native int valueSize(long j3, String str, boolean z6);

    public static native String version();

    private native int writeValueToNB(long j3, String str, long j7, int i7);

    public final boolean a(String str, boolean z6) {
        return decodeBool(this.nativeHandle, str, z6);
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        sync(false);
    }

    public native int ashmemFD();

    public native int ashmemMetaFD();

    public final double b(String str, double d4) {
        return decodeDouble(this.nativeHandle, str, d4);
    }

    public final float c(String str, float f7) {
        return decodeFloat(this.nativeHandle, str, f7);
    }

    public native void checkContentChangedByOuterProcess();

    public native void checkReSetCryptKey(String str);

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        clearAll();
        return this;
    }

    public native void clearAll();

    public native void clearAllWithKeepingSpace();

    public native void clearMemoryCache();

    public native void close();

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        sync(true);
        return true;
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        return containsKey(this.nativeHandle, str);
    }

    public native String cryptKey();

    public final int d(int i7, String str) {
        return decodeInt(this.nativeHandle, str, i7);
    }

    public native boolean disableAutoKeyExpire();

    public native void disableCompareBeforeSet();

    public final long e(String str, long j3) {
        return decodeLong(this.nativeHandle, str, j3);
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return this;
    }

    public native boolean enableAutoKeyExpire(int i7);

    public final String f(String str) {
        return decodeString(this.nativeHandle, str, null);
    }

    public final String g(String str, String str2) {
        return decodeString(this.nativeHandle, str, str2);
    }

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        throw new UnsupportedOperationException("Intentionally Not Supported. Use allKeys() instead, getAll() not implement because type-erasure inside mmkv");
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z6) {
        return decodeBool(this.nativeHandle, str, z6);
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f7) {
        return decodeFloat(this.nativeHandle, str, f7);
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i7) {
        return decodeInt(this.nativeHandle, str, i7);
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j3) {
        return decodeLong(this.nativeHandle, str, j3);
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        return decodeString(this.nativeHandle, str, str2);
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        String[] strArrDecodeStringSet = decodeStringSet(this.nativeHandle, str);
        if (strArrDecodeStringSet != null) {
            try {
                Set set2 = (Set) HashSet.class.newInstance();
                set2.addAll(Arrays.asList(strArrDecodeStringSet));
                return set2;
            } catch (IllegalAccessException | InstantiationException unused) {
            }
        }
        return set;
    }

    public final void i(int i7, String str) {
        encodeInt(this.nativeHandle, str, i7);
    }

    public final void j(String str, double d4) {
        encodeDouble(this.nativeHandle, str, d4);
    }

    public final void k(String str, float f7) {
        encodeFloat(this.nativeHandle, str, f7);
    }

    public final void l(String str, long j3) {
        encodeLong(this.nativeHandle, str, j3);
    }

    public native void lock();

    public final void m(String str, String str2) {
        encodeString(this.nativeHandle, str, str2);
    }

    public native String mmapID();

    public final void n(String str, boolean z6) {
        encodeBool(this.nativeHandle, str, z6);
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z6) {
        encodeBool(this.nativeHandle, str, z6);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f7) {
        encodeFloat(this.nativeHandle, str, f7);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i7) {
        encodeInt(this.nativeHandle, str, i7);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j3) {
        encodeLong(this.nativeHandle, str, j3);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        encodeString(this.nativeHandle, str, str2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        encodeSet(this.nativeHandle, str, set == null ? null : (String[]) set.toArray(new String[0]));
        return this;
    }

    public final void q(String str) {
        removeValueForKey(this.nativeHandle, str);
    }

    public native boolean reKey(String str);

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        throw new UnsupportedOperationException("Intentionally Not implement in MMKV");
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        q(str);
        return this;
    }

    public native void removeValuesForKeys(String[] strArr);

    public native void trim();

    public native boolean tryLock();

    public native void unlock();

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        throw new UnsupportedOperationException("Intentionally Not implement in MMKV");
    }
}
