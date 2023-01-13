package cn.xf;

import com.lowagie.text.Document;
import com.lowagie.text.pdf.PdfCopy;
import com.lowagie.text.pdf.PdfImportedPage;
import com.lowagie.text.pdf.PdfReader;

import java.io.FileOutputStream;

/**
 * @program: pdf-convert
 * @description:
 * @author: xf
 * @create: 2022-12-20 10:56
 **/
public class Main {

    /**
     * 合并pdf
     * @param files 需要合并的pdf路径
     * @param newfile 合并成新的文件的路径
     */
    public static boolean mergePdfFiles(String[] files, String newfile) {
        boolean retValue = false;
        Document document = null;
        PdfCopy copy = null;
        PdfReader reader = null;
        try {
            document = new Document(new PdfReader(files[0]).getPageSize(1));
            copy = new PdfCopy(document, new FileOutputStream(newfile));
            document.open();
            for (int i = 0; i < files.length; i++) {
                reader = new PdfReader(files[i]);
                int n = reader.getNumberOfPages();
                for (int j = 1; j <= n; j++) {
                    document.newPage();
                    PdfImportedPage page = copy.getImportedPage(reader, j);
                    copy.addPage(page);
                }
                reader.close();
            }
            retValue = true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                reader.close();
            }
            if (copy != null) {
                copy.close();
            }
            if (document != null) {
                document.close();
            }
        }
        return retValue;
    }

    public static void main(String[] args) {
        String[] files =new String[10];

        for (int i=0; i<10 ;i++){
            files[i] = "C:\\Users\\Administrator\\Desktop\\第二次省考\\C++程序设计\\00" + (i+1)+".pdf";
        }


        String savepath = "C:\\Users\\Administrator\\Desktop\\第二次省考\\C++程序设计\\C++程序设计-总.pdf";
        boolean b = mergePdfFiles(files, savepath);
        System.out.println(b);
    }


}
