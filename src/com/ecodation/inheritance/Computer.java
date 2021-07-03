package com.ecodation.inheritance;

import java.io.Serializable;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Computer implements Serializable {
	private static final long serialVersionUID = 8781514343062609002L;

	// Üst atadan(sup class)ın alt classlara(sub classa) ortak özelliklerini vermesidir.
	// Veri tekranını engelleme
	// Zamanda kazanç(zaman maliyeti)
	// @Override etmek özelliği
	// polymorphism olanak sağlıyor.
	// extends kelimesinden.

	// super constructor keyword
	// Üst atadan constructor çağırmak için super.method super() keyword kullanırız;
	// super(x,y,z). Alt classdan üst classın elemanlarına erişmek istersek kullanıyoruz veya metotlarına erişmek
	// istiyorsak super.metotAdi();
	// field alanaları süper.getID
	// Üst sınıftaki constructarı çağırmak için kullanıyoruz. örn: super(x,y,z);
	// Üst classtaki metotlara erişim sağlamak için kullanıyoruz örn: süper.ustMetotAdi();

	// protected: sınıf içerisinde metotlara veya değişkenlere alt classtakiler erişsin ancak farklı pakettekiler
	// erişemesiiiiiiiinnnnnnnnnn.
	// extends :kalıtım sağlamak için kullanıyoruz.
	// this.field
	// this(1,12); //farklı constructorları çağırmak için kullanıyoruz.

	// inheritance (is-a) , interface (can-do) ,compositon (has a)

	// super: Üst atadan methodları,fieldleri almak için kullanıyoruz.
	// this: Global değişkenlere erişmek için, başka bir constuctor çağırmak için kullanırız.

	// Serialization:Javada bulunan objelerimizi sadece local serverımızda değil başka local veya global serverımızda da
	// çalıştırmak istediğimizde serialization kullanıyoruz.
	// Serialization=Nesnelerimizin(objelerimizin) paketleyip başka bilgisayarda da bu paketlenen verilere erişilmesine
	// yardımcı oluyor.
	// Veri taşımalardan sağlıklı olması içindir.
	// Kalıcı hafıza (Harddiske yazmak) ram'de yer kalmazsa
	// Örnek; Hibernate , Web servisler (Jax-Rs) , File v.b

	protected int computerId;
	protected String computerName;
	protected String computerSerialVersion;
	protected String computerTrade;

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Computer other = (Computer) obj;
		return computerId == other.computerId && Objects.equals(computerName, other.computerName)
				&& Objects.equals(computerSerialVersion, other.computerSerialVersion)
				&& Objects.equals(computerTrade, other.computerTrade);
	}

	@Override
	public int hashCode() {
		return Objects.hash(computerId, computerName, computerSerialVersion, computerTrade);
	}

	// public Computer() {
	// // TODO Auto-generated constructor stub
	// }
	//
	// public Computer(int computerId, String computerName, String computerSerialVersion, String computerTrade) {
	// this.computerId = computerId;
	// this.computerName = computerName;
	// this.computerSerialVersion = computerSerialVersion;
	// this.computerTrade = computerTrade;
	// }
	//
	// public int getComputerId() {
	// return computerId;
	// }
	//
	// public void setComputerId(int computerId) {
	// this.computerId = computerId;
	// }
	//
	// public String getComputerName() {
	// return computerName;
	// }
	//
	// public void setComputerName(String computerName) {
	// this.computerName = computerName;
	// }
	//
	// public String getComputerSerialVersion() {
	// return computerSerialVersion;
	// }
	//
	// public void setComputerSerialVersion(String computerSerialVersion) {
	// this.computerSerialVersion = computerSerialVersion;
	// }
	//
	// public String getComputerTrade() {
	// return computerTrade;
	// }
	//
	// public void setComputerTrade(String computerTrade) {
	// this.computerTrade = computerTrade;
	// }
	//
	// @Override
	// public String toString() {
	// return "Computer [computerId=" + computerId + ", computerName=" + computerName + ", computerSerialVersion="
	// + computerSerialVersion + ", computerTrade=" + computerTrade + "]";
	// }

}
