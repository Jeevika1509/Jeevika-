package com.xworkz.copy.example;

import java.awt.AWTError;
import java.awt.AWTException;
import java.awt.FontFormatException;
import java.awt.color.ProfileDataException;
import java.awt.datatransfer.MimeTypeParseException;
import java.awt.geom.IllegalPathStateException;
import java.awt.image.ImagingOpException;
import java.awt.image.RasterFormatException;
import java.awt.print.PrinterException;
import java.beans.IntrospectionException;
import java.beans.PropertyVetoException;
import java.io.IOError;
import java.io.IOException;
import java.lang.annotation.AnnotationFormatError;
import java.lang.annotation.AnnotationTypeMismatchException;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.reflect.MalformedParametersException;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.channels.AlreadyBoundException;
import java.nio.charset.CoderMalfunctionError;
import java.nio.file.FileSystemAlreadyExistsException;
import java.nio.file.ProviderNotFoundException;
import java.rmi.MarshalException;
import java.rmi.activation.ActivationException;
import java.security.GeneralSecurityException;
import java.security.ProviderException;
import java.security.acl.AclNotFoundException;
import java.security.acl.NotOwnerException;
import java.security.cert.CertificateException;
import java.text.ParseException;
import java.time.DateTimeException;
import java.util.ConcurrentModificationException;
import java.util.EmptyStackException;
import java.util.IllformedLocaleException;
import java.util.MissingResourceException;
import java.util.NoSuchElementException;
import java.util.ServiceConfigurationError;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.prefs.BackingStoreException;
import java.util.zip.DataFormatException;

import javax.lang.model.type.MirroredTypesException;
import javax.management.BadStringOperationException;
import javax.management.InvalidApplicationException;
import javax.management.JMException;
import javax.management.JMRuntimeException;
import javax.management.modelmbean.InvalidTargetObjectTypeException;
import javax.naming.NamingException;
import javax.security.auth.DestroyFailedException;
import javax.security.auth.RefreshFailedException;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;
import javax.swing.text.BadLocationException;
import javax.swing.tree.ExpandVetoException;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import javax.xml.bind.JAXBException;
import javax.xml.crypto.NoSuchMechanismException;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerFactoryConfigurationError;

import org.ietf.jgss.GSSException;
import org.omg.CORBA.portable.ApplicationException;
import org.w3c.dom.events.EventException;
import org.w3c.dom.ls.LSException;
import org.w3c.dom.ranges.RangeException;

public class ExceptionProgram {

	public void runTimeExceptionMethod1()
	{
		System.out.println("running run time exceptionMethod1");
		throw new AnnotationTypeMismatchException(null, null);
	}
	public void runTimeExceptionMethod2()
	{
		System.out.println("running run time exceptionMethod2");
		throw new ArithmeticException();
	}
	public void runTimeExceptionMethod3()
	{
		System.out.println("running run time exceptionMethod3");
		throw new ArrayStoreException();
	}
	public void runTimeExceptionMethod4()
	{
		System.out.println("running run time exceptionMethod4");
		throw new BufferOverflowException();
	}
	public void runTimeExceptionMethod5()
	{
		System.out.println("running run time exceptionMethod5");
		throw new BufferUnderflowException();
	}
	public void runTimeExceptionMethod6()
	{
		System.out.println("running run time exceptionMethod6");
		throw new CannotRedoException();
	}
	public void runTimeExceptionMethod7()
	{
		System.out.println("running run time exceptionMethod7");
		throw new CannotUndoException();
	}
	public void runTimeExceptionMethod8()
	{
		System.out.println("running run time exceptionMethod8");
		throw new JMRuntimeException();
	}
	public void runTimeExceptionMethod9()
	{
		System.out.println("running run time exceptionMethod9");
		throw new ConcurrentModificationException();
	}
	public void runTimeExceptionMethod10()
	{
		System.out.println("running run time exceptionMethod10");
		throw new DateTimeException(null);
	}
	public void runTimeExceptionMethod11()
	{
		System.out.println("running run time exceptionMethod11");
		throw new LSException((short) 0, null);
	}
	public void runTimeExceptionMethod12()
	{
		System.out.println("running run time exceptionMethod12");
		throw new MalformedParametersException();
	}
	public void runTimeExceptionMethod13()
	{
		System.out.println("running run time exceptionMethod13");
		throw new EmptyStackException();
	}
	public void runTimeExceptionMethod14()
	{
		System.out.println("running run time exceptionMethod14");
		throw new EnumConstantNotPresentException(null, null);
	}
	public void runTimeExceptionMethod15()
	{
		System.out.println("running run time exceptionMethod15");
		throw new EventException((short) 0, null);
	}
	public void runTimeExceptionMethod16()
	{
		System.out.println("running run time exceptionMethod16");
		throw new FileSystemAlreadyExistsException();
	}
	public void runTimeExceptionMethod17()
	{
		System.out.println("running run time exceptionMethod17");
		throw new MirroredTypesException(null);
	}
	public void runTimeExceptionMethod18()
	{
		System.out.println("running run time exceptionMethod18");
		throw new MissingResourceException(null, null, null);
	}
	public void runTimeExceptionMethod19()
	{
		System.out.println("running run time exceptionMethod19");
		throw new IllegalArgumentException();
	}
	public void runTimeExceptionMethod20()
	{
		System.out.println("running run time exceptionMethod20");
		throw new NegativeArraySizeException();
	}
	public void runTimeExceptionMethod21()
	{
		System.out.println("running run time exceptionMethod21");
		throw new IllegalMonitorStateException();
	}
	public void runTimeExceptionMethod22()
	{
		System.out.println("running run time exceptionMethod22");
		throw new IllegalPathStateException();
	}
	public void runTimeExceptionMethod23()
	{
		System.out.println("running run time exceptionMethod23");
		throw new IllegalStateException();
	}
	public void runTimeExceptionMethod24()
	{
		System.out.println("running run time exceptionMethod24");
		throw new IllformedLocaleException();
	}
	public void runTimeExceptionMethod25()
	{
		System.out.println("running run time exceptionMethod25");
		throw new ImagingOpException(null);
	}
	public void runTimeExceptionMethod26()
	{
		System.out.println("running run time exceptionMethod26");
		throw new NoSuchElementException();
	}
	public void runTimeExceptionMethod27()
	{
		System.out.println("running run time exceptionMethod27");
		throw new NoSuchMechanismException();
	}
	public void runTimeExceptionMethod28()
	{
		System.out.println("running run time exceptionMethod28");
		throw new NullPointerException();
	}
	public void runTimeExceptionMethod29()
	{
		System.out.println("running run time exceptionMethod29");
		throw new IndexOutOfBoundsException();
	}
	public void runTimeExceptionMethod30()
	{
		System.out.println("running run time exceptionMethod30");
		throw new ProfileDataException(null);
	}
	public void runTimeExceptionMethod31()
	{
		System.out.println("running run time exceptionMethod31");
		throw new ProviderException();
	}
	public void runTimeExceptionMethod32()
	{
		System.out.println("running run time exceptionMethod32");
		throw new ProviderNotFoundException();
	}
	public void runTimeExceptionMethod33()
	{
		System.out.println("running run time exceptionMethod33");
		throw new RangeException((short) 0, null);
	}
	public void runTimeExceptionMethod34()
	{
		System.out.println("running run time exceptionMethod34");
		throw new RasterFormatException(null);
	}
	public void runTimeExceptionMethod35()
	{
		System.out.println("running run time exceptionMethod35");
		throw new RejectedExecutionException();
	}
	public void ExceptionMethod1() throws AclNotFoundException{
		System.out.println("running exceptionMethod1");
		throw new AclNotFoundException();
	}
	public void ExceptionMethod2() throws ActivationException{
		System.out.println("running exceptionMethod2");
		throw new ActivationException();
	}
	public void ExceptionMethod3() throws AlreadyBoundException{
		System.out.println("running exceptionMethod3");
		throw new AlreadyBoundException();
	}
	public void ExceptionMethod4() throws ApplicationException{
		System.out.println("running exceptionMethod4");
		throw new ApplicationException(null, null);
	}
	public void ExceptionMethod5() throws AWTException{
		System.out.println("running exceptionMethod5");
		throw new AWTException(null);
	}
	public void ExceptionMethod6() throws BadLocationException{
		System.out.println("running exceptionMethod6");
		throw new BadLocationException(null, 0);
	}
	public void ExceptionMethod7() throws BadStringOperationException{
		System.out.println("running exceptionMethod7");
		throw new BadStringOperationException(null);
	}
	public void ExceptionMethod8() throws BrokenBarrierException{
		System.out.println("running exceptionMethod8");
		throw new BrokenBarrierException();
	}
	public void ExceptionMethod9() throws CertificateException{
		System.out.println("running exceptionMethod9");
		throw new CertificateException();
	}
	
	public void ExceptionMethod10() throws CloneNotSupportedException{
		System.out.println("running exceptionMethod10");
		throw new CloneNotSupportedException();
	}
	public void ExceptionMethod11() throws DataFormatException{
		System.out.println("running exceptionMethod11");
		throw new DataFormatException();
	}
	public void ExceptionMethod12() throws DatatypeConfigurationException{
		System.out.println("running exceptionMethod12");
		throw new DatatypeConfigurationException();
	}
	public void ExceptionMethod13() throws DestroyFailedException{
		System.out.println("running exceptionMethod13");
		throw new DestroyFailedException();
	}
	public void ExceptionMethod14() throws ExpandVetoException{
		System.out.println("running exceptionMethod14");
		throw new ExpandVetoException(null);
	}
	public void ExceptionMethod15() throws FontFormatException{
		System.out.println("running exceptionMethod15");
		throw new FontFormatException(null);
	}
	public void ExceptionMethod16() throws GeneralSecurityException{
		System.out.println("running exceptionMethod16");
		throw new GeneralSecurityException();
	}
	public void ExceptionMethod17() throws GSSException{
		System.out.println("running exceptionMethod17");
		throw new GSSException(0);
	}
	public void ExceptionMethod18() throws IllegalClassFormatException{
		System.out.println("running exceptionMethod18");
		throw new IllegalClassFormatException();
	}
	public void ExceptionMethod19() throws IntrospectionException{
		System.out.println("running exceptionMethod19");
		throw new IntrospectionException(null);
	}
	public void ExceptionMethod20() throws InvalidApplicationException{
		System.out.println("running exceptionMethod20");
		throw new InvalidApplicationException(null);
	}
	public void ExceptionMethod21() throws InvalidMidiDataException{
		System.out.println("running exceptionMethod21");
		throw new InvalidMidiDataException();
	}
	public void ExceptionMethod22() throws InvalidTargetObjectTypeException{
		System.out.println("running exceptionMethod22");
		throw new InvalidTargetObjectTypeException();
	}
	public void ExceptionMethod23() throws IOException{
		System.out.println("running exceptionMethod23");
		throw new IOException();
	}
	public void ExceptionMethod24() throws MarshalException{
		System.out.println("running exceptionMethod24");
		throw new MarshalException(null);
	}
	public void ExceptionMethod25() throws JMException{
		System.out.println("running exceptionMethod25");
		throw new JMException();
	}
	public void ExceptionMethod26() throws MidiUnavailableException{
		System.out.println("running exceptionMethod26");
		throw new MidiUnavailableException();
	}
	public void ExceptionMethod27() throws MimeTypeParseException{
		System.out.println("running exceptionMethod27");
		throw new MimeTypeParseException();
	}
	public void ExceptionMethod28() throws NamingException{
		System.out.println("running exceptionMethod28");
		throw new NamingException();
	}
	public void ExceptionMethod29() throws NotOwnerException{
		System.out.println("running exceptionMethod29");
		throw new NotOwnerException();
	}
	public void ExceptionMethod30() throws ParseException{
		System.out.println("running exceptionMethod30");
		throw new ParseException(null, 0);
	}
	public void ExceptionMethod31() throws ParserConfigurationException{
		System.out.println("running exceptionMethod31");
		throw new ParserConfigurationException();
	}
	public void ExceptionMethod32() throws PrinterException{
		System.out.println("running exceptionMethod32");
		throw new PrinterException();
	}
	public void ExceptionMethod33() throws PropertyVetoException{
		System.out.println("running exceptionMethod33");
		throw new PropertyVetoException(null, null);
	}
	public void ExceptionMethod34() throws ReflectiveOperationException{
		System.out.println("running exceptionMethod34");
		throw new ReflectiveOperationException();
	}
	public void ExceptionMethod35() throws RefreshFailedException{
		System.out.println("running exceptionMethod35");
		throw new RefreshFailedException();
	}
	public void ErrorMethod1() {
		System.out.println("running AnnotationFormatError");
		throw new AnnotationFormatError("string");
	}
	public void ErrorMethod2() {
		System.out.println("running AssertionError");
		throw new AssertionError();
	}
	public void ErrorMethod3() {
		System.out.println("running AWTError");
		throw new AWTError(null);
	}
	public void ErrorMethod4() {
		System.out.println("running CoderMalfunctionError");
		throw new CoderMalfunctionError(null);
	}
	public void ErrorMethod5() {
		System.out.println("running FactoryConfigurationError");
		throw new FactoryConfigurationError();
	}
	public void ErrorMethod6() {
		System.out.println("running IOError");
		throw new IOError(null);
	}
	public void ErrorMethod7() {
		System.out.println("running LinkageError");
		throw new LinkageError();
	}
	public void ErrorMethod8() {
		System.out.println("running ServiceConfigurationError");
		throw new ServiceConfigurationError(null);
	}
	public void ErrorMethod9() {
		System.out.println("running ThreadDeath");
		throw new ThreadDeath();
	}
	public void ErrorMethod10() {
		System.out.println("running TransformFactoryConfigurationError");
		throw new TransformerFactoryConfigurationError();
	}
	public void ErrorMethod11() {
		System.out.println("running Error");
		throw new Error();
	}
	public void ErrorMethod12() {
		System.out.println("running InternalError");
		throw new InternalError();
	}
	public void ErrorMethod13() {
		System.out.println("running OutOfMemoryError");
		throw new OutOfMemoryError();
	}
	public void ErrorMethod14() {
		System.out.println("running StackOverFlowError");
		throw new StackOverflowError();
	}
	public void ErrorMethod15() {
		System.out.println("running UnknownError");
		throw new UnknownError();
	}
	public void ErrorMethod16() {
		System.out.println("running BootstrapMethodError");
		throw new BootstrapMethodError();
	}
	public void ErrorMethod17() {
		System.out.println("running ClassCircularityError");
		throw new ClassCircularityError();
	}
	public void ErrorMethod18() {
		System.out.println("running ClassFormatError");
		throw new ClassFormatError();
	}
	public void ErrorMethod19() {
		System.out.println("running ExceptionInInitializerError");
		throw new ExceptionInInitializerError();
	}
	public void ErrorMethod20() {
		System.out.println("running IncompatibleClassChangeError");
		throw new IncompatibleClassChangeError();
	}
	public void ErrorMethod21() {
		System.out.println("running NoClassDefFoundError");
		throw new NoClassDefFoundError();
	}
	public void ErrorMethod22() {
		System.out.println("running UnsatisfiedLinkError");
		throw new UnsatisfiedLinkError();
	}
	public void ErrorMethod23() {
		System.out.println("running VerifyError");
		throw new VerifyError();
	}
	public void ErrorMethod24() {
		System.out.println("running ClassCircularityError");
		throw new ClassCircularityError();
	}
	public void ErrorMethod25() {
		System.out.println("running IllegalAccessError");
		throw new IllegalAccessError();
	}
	public void ErrorMethod26() {
		System.out.println("running InstantiationError");
		throw new InstantiationError();
	}
	public void ErrorMethod27() {
		System.out.println("running NoSuchFieldError");
		throw new NoSuchFieldError();
	}
	public void ErrorMethod28() {
		System.out.println("running NoClassDefFoundError");
		throw new NoClassDefFoundError();
	}
	public void ErrorMethod29() {
		System.out.println("running UnsupportedClassVersionError");
		throw new UnsupportedClassVersionError();
	}
	public void ErrorMethod30() {
		System.out.println("running VerifyError");
		throw new VerifyError();
	}
}
