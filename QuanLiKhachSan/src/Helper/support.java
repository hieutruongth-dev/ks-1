/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helper;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class support {

    public static void addDateToCbb(JComboBox date, JComboBox month, JComboBox year) {
        Calendar now = Calendar.getInstance();
        date.removeAllItems();
        month.removeAllItems();
        year.removeAllItems();
        
        for (int i = 1; i <= 31; i++) {
            date.addItem(i);
            if (i <= 12) {
                month.addItem(i);
            }
        }
        
        int getYear = now.get(Calendar.YEAR);
        for (int i = 2010; i <= getYear; i++) {
            
            year.addItem(i);
        }
        date.setSelectedItem(now.get(Calendar.DAY_OF_MONTH));
        month.setSelectedItem(now.get(Calendar.MONTH));
        year.setSelectedItem(now.get(Calendar.YEAR));
    }

    public static Date getDateCbb(JComboBox date, JComboBox month, JComboBox year) {
        String getyear = year.getSelectedItem().toString();
        String getMonth = month.getSelectedItem().toString();
        String getDay = date.getSelectedItem().toString();
        String getDate = getDay + "/" + getMonth + "/" + getyear;
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date date1 = (Date) format.parse(getDate);
            return date1;
        } catch (ParseException ex) {
            Logger.getLogger(support.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static void FixDayWithMonth(JComboBox date, JComboBox month, JComboBox year) {
        int getyear = Integer.parseInt(year.getSelectedItem().toString());
        int getMonth = Integer.parseInt(month.getSelectedItem().toString().trim());
        int getDay = Integer.parseInt(date.getSelectedItem().toString());
        int saveDay = getDay;
        int numBerDay =0;
        if (getMonth == 1||getMonth == 3||getMonth == 5||getMonth == 7||getMonth ==8||getMonth == 10 || getMonth == 12) {
            numBerDay = 31;
        } else {
            numBerDay = 30;
        }
        
        if (getMonth == 2) {
            if (((getyear % 4 == 0) && (getyear % 100 != 0)) || (getyear % 400 == 0)) {
                numBerDay = 29;
            }
            else numBerDay=  28;
        }
        date.removeAllItems();
        for (int i = 1; i <= numBerDay; i++) {
            date.addItem(i);
        }
        
        if(getDay <= numBerDay) date.setSelectedItem(saveDay);
    }
    
    //xử lí ảnh
    public static void addAvt(JLabel avt){
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);//chỉ hiển thị file
        int returnValue = chooser.showOpenDialog(chooser);
        if(returnValue==JFileChooser.APPROVE_OPTION){
            File file = chooser.getSelectedFile();
            try {  
                ImageIcon img = new ImageIcon(ResizeIconAvt(file, avt.getWidth(), avt.getHeight()));
                avt.setIcon(img);
                avt.setText(""+file);
            } catch (Exception e) {
            }
        }
    }
    
    public static Image ResizeIconAvt(File file, int width, int height){
        
        try {
            BufferedImage b = ImageIO.read(file);
            Image img1 = b.getScaledInstance(width, height, Image.SCALE_SMOOTH);
            return img1;    
        } catch (Exception e) {
        }
        
        return null;
    }
    
    
    public static String changeUnicode(String input){
        input= input.toLowerCase();
        Pattern patternA = Pattern.compile("[àáạảãâầấậẩẫăằắặẳẵ]");
        Pattern patternE = Pattern.compile("[èéẹẻẽêềếệểễ]");
        Pattern patternI = Pattern.compile("[ìíịỉĩ]");
        Pattern patternO = Pattern.compile("[òóọỏõôồốộổỗơờớợởỡ]");
        Pattern patternU = Pattern.compile("[ùúụủũưừứựửữ]");
        Pattern patternY = Pattern.compile("[ỳýỵỷỹ]");
        Pattern patternD = Pattern.compile("[đ]");
        
        Matcher matcher = patternA.matcher(input);  
        input =  matcher.replaceAll("a");

        matcher = patternE.matcher(input);  
        input =  matcher.replaceAll("e");

        matcher = patternI.matcher(input);  
        input =  matcher.replaceAll("i");

        matcher = patternO.matcher(input);  
        input =  matcher.replaceAll("o");

        matcher = patternU.matcher(input);  
        input =  matcher.replaceAll("u");

        matcher = patternY.matcher(input);  
        input =  matcher.replaceAll("y");

        
        matcher = patternD.matcher(input);
        input =  matcher.replaceAll("d");
        
        return input;
    }
    
    public static boolean testBieuThuc(String regax,String input){
        Pattern pattern = Pattern.compile(regax);
        Matcher matcher = pattern.matcher(input);
        return !matcher.find();
    }
    
    public static void ThongBao (boolean test , String content){
        if(test){
            JOptionPane.showMessageDialog(null, content+" thành công !!");
        }
        else JOptionPane.showMessageDialog(null, content+" thất bại !!");
    }
}
