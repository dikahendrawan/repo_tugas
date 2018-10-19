package smstr5;

import javax.swing.*;
import java.awt.event.*;

public class EventHandling extends JFrame{
    JLabel lblnama1=new JLabel("Nama Peserta 1");
    JTextField txnama1=new JTextField(20);
    JLabel lblnama2=new JLabel("Nama Peserta 2");
    JTextField txnama2=new JTextField(20);
    JLabel lblmanager=new JLabel("Nama Manager");
    JTextField txmanager=new JTextField(20);
    JLabel lblkelas=new JLabel("Kelas");
    JRadioButton smasmk=new JRadioButton("SMA/SMK");
    JRadioButton mahasiswa=new JRadioButton("Mahasiswa");
    JRadioButton instansi=new JRadioButton("Instansi");
    ButtonGroup kelompok=new ButtonGroup();
    JLabel lblkategori=new JLabel("Kategori");
    JCheckBox gandacampur=new JCheckBox("Ganda Campuran");
    JCheckBox gandaputra=new JCheckBox("Ganda Putra");
    JCheckBox gandaputri=new JCheckBox("Ganda Putri");
    JCheckBox tunggalputra=new JCheckBox("Tunggal Putra");
    JCheckBox tunggalputri=new JCheckBox("Tunggal Putri");
    JButton cetak=new JButton("Cetak");
    JTextArea hasil=new JTextArea();
EventHandling(){
    setTitle("Smash Baramian");
    setLocation(400,100);
    setSize(400,430);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }   
void KomponenVisual(){
    getContentPane().setLayout(null);
    getContentPane().add(lblnama1);
    lblnama1.setBounds(10,10,100,20);
    getContentPane().add(txnama1);
    txnama1.setBounds(130,10,240,20);
    getContentPane().add(lblnama2);
    lblnama2.setBounds(10,35,100,20);
    getContentPane().add(txnama2);
    txnama2.setBounds(130,35,240,20);
    getContentPane().add(lblmanager);
    lblmanager.setBounds(10,60,100,20);
    getContentPane().add(txmanager);
    txmanager.setBounds(130,60,240,20);
    getContentPane().add(lblkelas);
    lblkelas.setBounds(10,85,80,20);
    kelompok.add(smasmk);
    kelompok.add(mahasiswa);
    kelompok.add(instansi);
    getContentPane().add(smasmk);
    smasmk.setBounds(130,85,80,20);
    getContentPane().add(mahasiswa);
    mahasiswa.setBounds(210,85,90,20);
    getContentPane().add(instansi);
    instansi.setBounds(300,85,90,20);
    getContentPane().add(lblkategori);
    lblkategori.setBounds(10,110,70,20);
    getContentPane().add(gandacampur);
    gandacampur.setBounds(130,110,130,20);
    getContentPane().add(gandaputra);
    gandaputra.setBounds(130,135,130,20);
    getContentPane().add(gandaputri);
    gandaputri.setBounds(130,160,130,20);
    getContentPane().add(tunggalputra);
    tunggalputra.setBounds(130,185,130,20);
    getContentPane().add(tunggalputri);
    tunggalputri.setBounds(130,210,130,20);
    getContentPane().add(cetak);
    cetak.setBounds(10,235,360,20);
    getContentPane().add(hasil);
    hasil.setBounds(10,260,360,100);
    setVisible(true);
    }
void AksiReaksi(){
    cetak.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
    hasil.append(txnama1.getText()+"\n");
    hasil.append(txnama2.getText()+"\n");
    hasil.append(txmanager.getText()+"\n");
    if(smasmk.isSelected()==true){
    hasil.append(smasmk.getText()+"\n");}
    if(mahasiswa.isSelected()==true){
    hasil.append(mahasiswa.getText()+"\n");}
    else{
    hasil.append(instansi.getText()+"\n");}
    if(gandacampur.isSelected()==true){
    hasil.append(gandacampur.getText()+"\n");}
    if(gandaputra.isSelected()==true){
    hasil.append(gandaputra.getText()+"\n");}
    if(gandaputri.isSelected()==true){
    hasil.append(gandaputri.getText()+"\n");}
    if(tunggalputra.isSelected()==true){
    hasil.append(tunggalputra.getText()+"\n");}
    if(tunggalputri.isSelected()==true){
    hasil.append(tunggalputri.getText()+"\n");}
    }
    });
    }
public static void main(String args[]){
    EventHandling e5=new EventHandling();
    e5.KomponenVisual();
    e5.AksiReaksi();
    }
}