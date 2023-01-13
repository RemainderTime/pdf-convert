package cn.xf;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: pdf-convert
 * @description: 生成二维码图片
 * @author: xf
 * @create: 2023-01-04 15:12
 **/
public class ShortUrl {

    public static void main(String[] args) {

        List<String> locationIds = Arrays.asList(            "成都站",
                "重庆站",
                "武汉站",
                "西安站",
                "贵阳站",
                "兰州站",
                "郑州站",
                "昆明站",
                "杭州站",
                "青岛站",
                "长沙站",
                "南京站",
                "咸阳站",
                "宁波站",
                "龙泉驿站",
                "泉州站",
                "合肥站",
                "天津站",
                "芜湖站",
                "北京站",
                "南昌站",
                "无锡站",
                "石家庄站",
                "苏州站",
                "济南站",
                "万州站",
                "淄博站",
                "郫都站",
                "新都站",
                "双流站",
                "温江站",
                "海口站",
                "上海站",
                "太原站",
                "南宁站",
                "广州站",
                "深圳站",
                "沈阳站",
                "长春站",
                "哈尔滨站",
                "大连站",
                "唐山站",
                "烟台站",
                "徐州站",
                "西宁站",
                "常州站",
                "镇江站",
                "嘉兴站",
                "福州站",
                "厦门站",
                "佛山站",
                "东莞站",
                "宜昌站",
                "襄阳站",
                "顺义站",
                "扬州站",
                "温州站",
                "乐山站",
                "江门站",
                "惠州站",
                "北京通州站",
                "珠海站",
                "桂林站",
                "中山站",
                "丽江站",
                "泰州站",
                "台州站",
                "岳阳站",
                "昆山站",
                "江阴站",
                "宜兴站",
                "柳州站",
                "临沂站",
                "株洲站",
                "潍坊站",
                "赣州站",
                "廊坊站",
                "广汉站",
                "宝山站",
                "楚雄站",
                "常熟站",
                "青浦站",
                "杨浦站",
                "龙岗站",
                "黄埔站",
                "阜阳站",
                "昌平站",
                "上海4站",
                "上海精选",
                "闵行站",
                "顺德站",
                "嘉定站",
                "滨海站",
                "江宁站",
                "青白江站",
                "菏泽站",
                "杭州精选",
                "宝安站",
                "秦皇岛站",
                "番禺站",
                "张家港站",
                "南京江北站",
                "花都站",
                "武汉精选",
                "汉阳站",
                "运城站",
                "栖霞站",
                "泰安站",
                "宿迁站",
                "呈贡站",
                "惠阳站",
                "无锡精选",
                "清远站",
                "新津站",
                "北京5站",
                "杭州优选",
                "小榄站",
                "江夏站",
                "城阳站",
                "龙华站",
                "西安精选",
                "玉林站",
                "塘厦站",
                "承德站",
                "三水站",
                "锦州站",
                "沙坪坝站",
                "丰润站",
                "滁州站",
                "蚌埠站",
                "毕节站",
                "龙岩站",
                "博罗站",
                "石狮站",
                "许昌站",
                "松山湖站",
                "衡水站",
                "大理站",
                "四会站",
                "晋中站",
                "淮北站",
                "鹤山站",
                "抚顺站",
                "大兴站",
                "丽水站",
                "长沙精选",
                "鄂州站",
                "邵阳站",
                "宝应站",
                "郓城站",
                "夹江站",
                "阳朔站",
                "全州站",
                "从化站",
                "黄冈站",
                "正定站",
                "沛县站",
                "金港站",
                "余杭站",
                "新郑站",
                "荥阳站",
                "大港站",
                "沈北站",
                "长安站",
                "西青站");
        List<String> urlList = Arrays.asList(
                "http://t.llzbyle.cn/s/IeeTz4ri",
                "http://t.llzbyn.cn/s/MJPn1a5n",
                "http://llzb.vip/s/OkrEuOw9",
                "http://t.llzbyll.cn/s/g0xklBRF",
                "http://t.llzbye.cn/s/hiaikxNk",
                "http://t.llzbyn.cn/s/YcVQAobG",
                "http://t.llzbyn.cn/s/tBYLyWlF",
                "http://t.llzbyn.cn/s/hgRyN1ww",
                "http://t.llzbyg.cn/s/71J0nlDz",
                "http://t.llzbylc.cn/s/yWbbNExb",
                "http://llzb.tv/s/0tEjxRdo",
                "http://t.llzbyle.cn/s/YW45vqUZ",
                "http://llzb.cc/s/IGYKvVFa",
                "http://llzb.cc/s/grLyI0eC",
                "http://t.llzbyf.cn/s/Twfq92vt",
                "http://llzb.tv/s/1LEw5sJF",
                "http://t.llzbyi.cn/s/3LV66jZN",
                "http://t.llzbyle.cn/s/DQNPS0xN",
                "http://t.llzbyb.cn/s/tQWi5Mzf",
                "http://t.llzbylc.cn/s/njY3IwW6",
                "http://t.llzbyle.cn/s/xH0dtjJv",
                "http://t.llzbylf.cn/s/dbABAhlt",
                "http://t.llzbylf.cn/s/qsP1stah",
                "http://t.llzbylf.cn/s/242rrqDV",
                "http://llzb.cc/s/62poQwZt",
                "http://llzb.vip/s/O80CGJYO",
                "http://llzb.tv/s/O3MkhtyI",
                "http://llzb.tv/s/UTsi2Q4f",
                "http://t.llzbyn.cn/s/DNX4ZmW2",
                "http://t.llzbyn.cn/s/p0AlZOga",
                "http://t.llzbylf.cn/s/mYjotRab",
                "http://t.llzbyf.cn/s/u1B9CbC7",
                "http://t.llzbyn.cn/s/np2zV6ax",
                "http://llzb.cc/s/obFFUfhy",
                "http://llzb.cc/s/bxTBcDfD",
                "http://t.llzbyn.cn/s/QsswLMrY",
                "http://t.llzbyle.cn/s/60swUnm6",
                "http://t.llzbyn.cn/s/rCODdqyD",
                "http://t.llzbylf.cn/s/FAgJhAUA",
                "http://t.llzbylf.cn/s/jFRPrwsX",
                "http://t.llzbylf.cn/s/rIxIR2Nt",
                "http://t.llzbyn.cn/s/F3SvZUDF",
                "http://llzb.cc/s/7bT9F1Xl",
                "http://t.llzbyle.cn/s/oWLIihd3",
                "http://t.llzbyle.cn/s/oLMucFza",
                "http://t.llzbylf.cn/s/8DeAIh3v",
                "http://t.llzbylf.cn/s/OzZmw35C",
                "http://t.llzbya.cn/s/csS4N7Y3",
                "http://t.llzbyle.cn/s/wbXN36ka",
                "http://t.llzbyle.cn/s/UOzlpExe",
                "http://t.llzbylf.cn/s/SmWxsmPo",
                "http://t.llzbylf.cn/s/znr6Ppz2",
                "http://t.llzbylc.cn/s/1wKjXgHu",
                "http://t.llzbyn.cn/s/5Xhu7cto",
                "http://llzb.vip/s/5adtTuCo",
                "http://t.llzbylf.cn/s/KDBueYnd",
                "http://llzb.vip/s/XN5OKKY7",
                "http://t.llzbye.cn/s/EBnPvYAn",
                "http://t.llzbyle.cn/s/l0pb7W2h",
                "http://t.llzbylf.cn/s/72bCY4B5",
                "http://t.llzbytct.cn/s/C4MSsE36",
                "http://t.llzbylf.cn/s/W7jl5fc5",
                "http://llzb.vip/s/oXvxWOqz",
                "http://t.llzbylf.cn/s/MSZQYNFQ",
                "http://t.llzbyle.cn/s/NzeP4gOK",
                "http://t.llzbylf.cn/s/RF1y38bI",
                "http://t.llzbyc.cn/s/JyeUTYVB",
                "http://llzb.cc/s/9pgl8nfI",
                "http://t.llzbyle.cn/s/dQB8Jyfa",
                "http://t.llzbylf.cn/s/KX3PbQho",
                "http://t.llzbyn.cn/s/UEfBumNz",
                "http://t.llzbyn.cn/s/tyOQWaYr",
                "http://t.llzbyi.cn/s/yt7MQGgf",
                "http://t.llzbyn.cn/s/ZZK9TgkV",
                "http://t.llzbylc.cn/s/5bUbKjvc",
                "http://t.llzbyle.cn/s/KyaRS61w",
                "http://t.llzbylf.cn/s/QEcMpept",
                "http://t.llzbyh.cn/s/1SIi5tG2",
                "http://llzb.tv/s/JRvlm4QB",
                "http://llzb.vip/s/CYl7uYl2",
                "http://t.llzbyle.cn/s/srF9rHiw",
                "http://t.llzbytct.cn/s/7T5BQwzf",
                "http://t.llzbyf.cn/s/GenvY1oJ",
                "http://llzb.cc/s/694TTUTa",
                "http://t.llzbyle.cn/s/z3nApx6E",
                "http://llzb.vip/s/49ZlbI06",
                "http://t.llzbyb.cn/s/GP0uXMJ7",
                "http://t.llzbye.cn/s/0XEs8ID5",
                "http://t.llzbytct.cn/s/Ewa9Un9C",
                "http://t.llzbyla.cn/s/Tfn7FRwV",
                "http://t.llzbyn.cn/s/ojuDwCxw",
                "http://t.llzbytct.cn/s/8P8uOSGZ",
                "http://t.llzbyn.cn/s/YVu7uUgW",
                "http://llzb.vip/s/qR7FTmd0",
                "http://t.llzbylf.cn/s/OO7VMgR6",
                "http://llzb.cc/s/PTBWETtt",
                "http://t.llzbytc.cn/s/G7e2D9P7",
                "http://t.llzbyn.cn/s/KhYLez6k",
                "http://t.llzbyn.cn/s/FbTZyBZZ",
                "http://t.llzbyll.cn/s/6ihWLcGV",
                "http://t.llzbyn.cn/s/HQ2OQbwU",
                "http://llzb.vip/s/GIwtqelf",
                "http://t.llzbyn.cn/s/Zgr89Chl",
                "http://t.llzbyc.cn/s/nN61v2VK",
                "http://t.llzbyb.cn/s/wG5ycn4k",
                "http://llzb.tv/s/0kWa2leD",
                "http://t.llzbye.cn/s/VWha7YbC",
                "http://t.llzbyle.cn/s/iZ5hP3dL",
                "http://t.llzbyn.cn/s/y2rNPqba",
                "http://t.llzbyll.cn/s/OiUqcE9a",
                "http://t.llzbytct.cn/s/rJLBbzsD",
                "http://t.llzbylb.cn/s/KpcPOODj",
                "http://t.llzbytct.cn/s/O1dimjyY",
                "http://t.llzbylf.cn/s/4ft43XMz",
                "http://t.llzbyll.cn/s/RB2m0MQm",
                "http://t.llzbylc.cn/s/DiCYje5A",
                "http://t.llzbye.cn/s/JTyOc9X9",
                "http://t.llzbya.cn/s/0Ay6AzFq",
                "http://t.llzbym.cn/s/PmnW9Xvk",
                "http://t.llzbye.cn/s/m17jfl9s",
                "http://t.llzbyc.cn/s/EXBxAXhZ",
                "http://t.llzbyl.cn/s/VEKH4zCI",
                "http://t.llzbyn.cn/s/o54tLWK2",
                "http://t.llzbyle.cn/s/oxMoAtJd",
                "http://t.llzbytc.cn/s/jFWNJK9q",
                "http://t.llzbyn.cn/s/PJvgTuP6",
                "http://llzb.cc/s/Blw353Nz",
                "http://llzb.tv/s/0tlfoDmW",
                "http://t.llzbyc.cn/s/6L2b4Z6S",
                "http://t.llzbytc.cn/s/35EkISNt",
                "http://t.llzbyll.cn/s/guw3Eymv",
                "http://t.llzbyle.cn/s/pdof3enA",
                "http://llzb.tv/s/pTWytQs1",
                "http://t.llzbytct.cn/s/0TuOrkQ9",
                "http://t.llzbylf.cn/s/PyDI0QQJ",
                "http://t.llzbyf.cn/s/973nOo8f",
                "http://t.llzbyn.cn/s/FJRbEAJt",
                "http://t.llzbyle.cn/s/kIRIDe9O",
                "http://t.llzbytc.cn/s/VDpdvVEi",
                "http://llzb.vip/s/FDa5eN07",
                "http://t.llzbym.cn/s/YRAKYwfd",
                "http://t.llzbye.cn/s/OauM5Mhc",
                "http://t.llzbylf.cn/s/C49LHHRD",
                "http://t.llzbytct.cn/s/l8bRYUrq",
                "http://llzb.vip/s/usj5PSFC",
                "http://t.llzbytct.cn/s/YkTpomX0",
                "http://t.llzbyn.cn/s/xFkjxKxL",
                "http://t.llzbyn.cn/s/rXPfZh2s",
                "http://llzb.cc/s/XBtRiJ9O",
                "http://llzb.vip/s/nU3dIQnt",
                "http://llzb.tv/s/dSB9W1ex",
                "http://t.llzbytct.cn/s/X3RF6gQi",
                "http://t.llzbye.cn/s/xElowLpn",
                "http://t.llzbytc.cn/s/kpCBvyYw",
                "http://t.llzbytct.cn/s/527hrLy0",
                "http://llzb.cc/s/OFdf4JfW",
                "http://llzb.tv/s/6rnv924L",
                "http://llzb.tv/s/Ru0RwUfU",
                "http://llzb.vip/s/7Zf5dS33",
                "http://t.llzbya.cn/s/WaQO5toA",
                "http://llzb.tv/s/Lf0uVA8q",
                "http://t.llzbyf.cn/s/MI0C9aTz",
                "http://llzb.tv/s/v169Ba1j",
                "http://llzb.vip/s/1cv6eRFK",
                "http://t.llzbyf.cn/s/ZjPaPMy6");
//        List<String> locationIds = Arrays.asList("成都站");
//        List<String> urlList = Arrays.asList("http://llzb.vip/s/okhzwJa5");
        for (int i = 0; i < locationIds.size(); i++) {
            String qr1 = createQr(urlList.get(i), true, locationIds.get(i));
            System.out.println(qr1);
        }


    }


    public static String createQr(String link, Boolean isRemoveSide, String name) {
        if (link == null || link.length() <= 0) {
            System.err.println("链接地址不能为空");
            return "";
        }

        try {
            Map<EncodeHintType, Object> hints = new HashMap<EncodeHintType, Object>();
            // 指定编码格式
            hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
            // 指定纠错级别(L--7%,M--15%,Q--25%,H--30%)
            hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H);
            // 编码内容,编码类型(这里指定为二维码),生成图片宽度,生成图片高度,设置参数
            BitMatrix bitMatrix = new MultiFormatWriter().encode(link, BarcodeFormat.QR_CODE, 355, 355, hints);

            //去除白边
            if (isRemoveSide) {
                bitMatrix = deleteWhite(bitMatrix);
            }

            //以我的电脑为例
            String path = "G:\\图文文档集\\shorturl\\" + name + ".png";
//            String path = "G:\\图文文档集\\" + name + ".png";

            //设置请求头
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            MatrixToImageWriter.writeToStream(bitMatrix, "png", fileOutputStream);
            fileOutputStream.close();

            QRCodeTools.deEncodeByPath("G:\\图文文档集\\海报-整合版.png", path, name);
            return path;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    //去除二维码白边
    private static BitMatrix deleteWhite(BitMatrix matrix) {
        int[] rec = matrix.getEnclosingRectangle();
        int resWidth = rec[2] + 1;
        int resHeight = rec[3] + 1;

        BitMatrix resMatrix = new BitMatrix(resWidth, resHeight);
        resMatrix.clear();
        for (int i = 0; i < resWidth; i++) {
            for (int j = 0; j < resHeight; j++) {
                if (matrix.get(i + rec[0], j + rec[1])) resMatrix.set(i, j);
            }
        }
        return resMatrix;


    }







}