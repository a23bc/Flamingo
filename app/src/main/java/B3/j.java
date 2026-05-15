package B3;

import L2.C0247a;
import d.C0746L;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap f848a = new HashMap();

    public static int b(char[] cArr, int i7, int i8) {
        int i9;
        char c7 = cArr[i7];
        boolean z6 = false;
        if (c7 < '0') {
            i7++;
            z6 = c7 == '-';
            i9 = 0;
        } else {
            i9 = 0;
        }
        while (i7 <= i8) {
            int i10 = i7 + 1;
            char c8 = cArr[i7];
            if ('0' <= c8 && c8 <= '9') {
                i9 = (i9 * 10) - (c8 - '0');
            }
            i7 = i10;
        }
        return z6 ? i9 : -i9;
    }

    public static d6.e e(Node node) {
        d6.e eVar = new d6.e();
        NamedNodeMap attributes = node.getAttributes();
        int length = attributes.getLength();
        for (int i7 = 0; i7 < length; i7++) {
            Node nodeItem = attributes.item(i7);
            String nodeName = nodeItem.getNodeName();
            if ("begin".equals(nodeName)) {
                eVar.f11286a = f(nodeItem);
            } else if ("end".equals(nodeName)) {
                eVar.f11287b = f(nodeItem);
            }
        }
        eVar.f11288c = node.getTextContent();
        Node nextSibling = node.getNextSibling();
        if (nextSibling != null && nextSibling.getNodeType() == 3 && nextSibling.getNodeValue().equals(" ")) {
            eVar.f11289d = true;
        }
        return eVar;
    }

    public static int f(Node node) {
        int iB;
        int i7;
        int iB2;
        String nodeValue = node.getNodeValue();
        int i8 = 0;
        if (nodeValue == null || nodeValue.length() <= 0) {
            return 0;
        }
        char[] charArray = nodeValue.toCharArray();
        if (charArray.length < 1) {
            return 0;
        }
        int i9 = 0;
        int i10 = 0;
        for (char c7 : charArray) {
            if (c7 == ':') {
                i9++;
            } else if (c7 == '.') {
                i10++;
            } else if ('0' > c7 || c7 > '9') {
                return 0;
            }
        }
        int i11 = 0;
        if (i9 == 2) {
            while (true) {
                if (i11 >= charArray.length) {
                    i11 = 0;
                    break;
                }
                if (':' == charArray[i11]) {
                    break;
                }
                i11++;
            }
            iB = b(charArray, 0, i11 - 1);
        } else {
            iB = 0;
        }
        if (i9 > 0) {
            int i12 = i11;
            while (true) {
                if (i12 >= charArray.length) {
                    i12 = i11;
                    break;
                }
                if (':' == charArray[i12]) {
                    break;
                }
                i12++;
            }
            int iB3 = b(charArray, i11, i12 - 1);
            i11 = i12 + 1;
            i7 = iB3;
        } else {
            i7 = 0;
        }
        if (i10 > 0) {
            int i13 = i11;
            while (true) {
                if (i13 >= charArray.length) {
                    i13 = i11;
                    break;
                }
                if ('.' == charArray[i13]) {
                    break;
                }
                i13++;
            }
            int iB4 = b(charArray, i11, i13 - 1);
            if (i10 > 0) {
                int i14 = i13 + 1;
                int length = charArray.length - i14 >= 3 ? i13 + 3 : charArray.length - 1;
                iB2 = b(charArray, i14, length);
                int i15 = (length + 1) - i14;
                if (i15 == 1) {
                    i8 = iB2 * 100;
                } else {
                    if (i15 == 2) {
                        i8 = iB2 * 10;
                    }
                    i8 = iB4;
                }
                iB2 = i8;
                i8 = iB4;
            } else {
                iB2 = i8;
                i8 = iB4;
            }
        } else {
            iB2 = 0;
        }
        return (i8 * 1000) + (i7 * 60000) + (iB * 3600000) + iB2;
    }

    public C0247a a(Document document) {
        try {
            C0247a c0247a = new C0247a(21, false);
            Element documentElement = document.getDocumentElement();
            NamedNodeMap attributes = documentElement.getAttributes();
            int length = attributes.getLength();
            if (length >= 1) {
                for (int i7 = 0; i7 < length; i7++) {
                    Node nodeItem = attributes.item(i7);
                    if ("xml:lang".equals(nodeItem.getNodeName())) {
                        nodeItem.getNodeValue();
                    }
                }
            }
            NodeList childNodes = documentElement.getChildNodes();
            int length2 = childNodes.getLength();
            C0247a c0247aC = null;
            for (int i8 = 0; i8 < length2; i8++) {
                Node nodeItem2 = childNodes.item(i8);
                String nodeName = nodeItem2.getNodeName();
                if ("body".equals(nodeName)) {
                    c0247aC = c(nodeItem2);
                } else if ("head".equals(nodeName)) {
                    d(nodeItem2);
                }
            }
            c0247a.f4105p = c0247aC;
            return c0247a;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0498  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public L2.C0247a c(org.w3c.dom.Node r43) {
        /*
            Method dump skipped, instruction units count: 1334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: B3.j.c(org.w3c.dom.Node):L2.a");
    }

    public void d(Node node) {
        Node namedItem;
        NodeList childNodes = node.getChildNodes();
        for (int i7 = 0; i7 < childNodes.getLength(); i7++) {
            Node nodeItem = childNodes.item(i7);
            if ("metadata".equals(nodeItem.getNodeName())) {
                NodeList childNodes2 = nodeItem.getChildNodes();
                int length = childNodes2.getLength();
                C0746L c0746l = null;
                ArrayList arrayList = null;
                HashMap map = null;
                for (int i8 = 0; i8 < length; i8++) {
                    Node nodeItem2 = childNodes2.item(i8);
                    String nodeName = nodeItem2.getNodeName();
                    if ("ttm:agent".equals(nodeName)) {
                        if (c0746l == null) {
                            c0746l = new C0746L(1);
                            arrayList = new ArrayList();
                        }
                        NamedNodeMap attributes = nodeItem2.getAttributes();
                        int length2 = attributes.getLength();
                        for (int i9 = 0; i9 < length2; i9++) {
                            Node nodeItem3 = attributes.item(i9);
                            String nodeName2 = nodeItem3.getNodeName();
                            if ("type".equals(nodeName2)) {
                                nodeItem3.getNodeValue();
                            } else if ("xml:id".equals(nodeName2)) {
                                nodeItem3.getNodeValue();
                            }
                        }
                        arrayList.add(new d6.b());
                    } else if ("iTunesMetadata".equals(nodeName)) {
                        NodeList childNodes3 = nodeItem2.getChildNodes();
                        int i10 = 0;
                        while (true) {
                            if (i10 < childNodes3.getLength()) {
                                Node nodeItem4 = childNodes3.item(i10);
                                if ("translations".equals(nodeItem4.getNodeName())) {
                                    NodeList childNodes4 = nodeItem4.getChildNodes();
                                    int i11 = 0;
                                    while (true) {
                                        if (i11 < childNodes4.getLength()) {
                                            Node nodeItem5 = childNodes4.item(i11);
                                            if ("translation".equals(nodeItem5.getNodeName()) && map == null) {
                                                map = new HashMap();
                                                Node namedItem2 = nodeItem5.getAttributes().getNamedItem("xml:lang");
                                                if (namedItem2 != null) {
                                                    namedItem2.getNodeValue();
                                                }
                                                NodeList childNodes5 = nodeItem5.getChildNodes();
                                                for (int i12 = 0; i12 < childNodes5.getLength(); i12++) {
                                                    Node nodeItem6 = childNodes5.item(i12);
                                                    if ("text".equals(nodeItem6.getNodeName()) && (namedItem = nodeItem6.getAttributes().getNamedItem("for")) != null) {
                                                        map.put(namedItem.getNodeValue(), nodeItem6.getTextContent());
                                                    }
                                                }
                                            } else {
                                                i11++;
                                            }
                                        }
                                    }
                                } else {
                                    i10++;
                                }
                            }
                        }
                    }
                }
                if (c0746l != null) {
                    arrayList.clear();
                }
                if (map == null || map.isEmpty()) {
                    return;
                }
                this.f848a = map;
                return;
            }
        }
    }

    public void g(Object obj, String str) {
        HashMap map = this.f848a;
        if (obj == null) {
            map.put(str, null);
            return;
        }
        Class<?> cls = obj.getClass();
        if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
            map.put(str, obj);
            return;
        }
        int i7 = 0;
        if (cls == boolean[].class) {
            boolean[] zArr = (boolean[]) obj;
            N3.h hVar = N3.h.f5134b;
            Boolean[] boolArr = new Boolean[zArr.length];
            while (i7 < zArr.length) {
                boolArr[i7] = Boolean.valueOf(zArr[i7]);
                i7++;
            }
            map.put(str, boolArr);
            return;
        }
        if (cls == byte[].class) {
            byte[] bArr = (byte[]) obj;
            N3.h hVar2 = N3.h.f5134b;
            Byte[] bArr2 = new Byte[bArr.length];
            while (i7 < bArr.length) {
                bArr2[i7] = Byte.valueOf(bArr[i7]);
                i7++;
            }
            map.put(str, bArr2);
            return;
        }
        if (cls == int[].class) {
            int[] iArr = (int[]) obj;
            N3.h hVar3 = N3.h.f5134b;
            Integer[] numArr = new Integer[iArr.length];
            while (i7 < iArr.length) {
                numArr[i7] = Integer.valueOf(iArr[i7]);
                i7++;
            }
            map.put(str, numArr);
            return;
        }
        if (cls == long[].class) {
            long[] jArr = (long[]) obj;
            N3.h hVar4 = N3.h.f5134b;
            Long[] lArr = new Long[jArr.length];
            while (i7 < jArr.length) {
                lArr[i7] = Long.valueOf(jArr[i7]);
                i7++;
            }
            map.put(str, lArr);
            return;
        }
        if (cls == float[].class) {
            float[] fArr = (float[]) obj;
            N3.h hVar5 = N3.h.f5134b;
            Float[] fArr2 = new Float[fArr.length];
            while (i7 < fArr.length) {
                fArr2[i7] = Float.valueOf(fArr[i7]);
                i7++;
            }
            map.put(str, fArr2);
            return;
        }
        if (cls != double[].class) {
            throw new IllegalArgumentException("Key " + str + " has invalid type " + cls);
        }
        double[] dArr = (double[]) obj;
        N3.h hVar6 = N3.h.f5134b;
        Double[] dArr2 = new Double[dArr.length];
        while (i7 < dArr.length) {
            dArr2[i7] = Double.valueOf(dArr[i7]);
            i7++;
        }
        map.put(str, dArr2);
    }

    public void h(HashMap map) {
        for (Map.Entry entry : map.entrySet()) {
            g(entry.getValue(), (String) entry.getKey());
        }
    }
}
