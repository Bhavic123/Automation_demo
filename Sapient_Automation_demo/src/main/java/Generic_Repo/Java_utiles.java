package Generic_Repo;

import java.util.Date;
import java.util.Random;

import com.github.javafaker.Faker;

public class Java_utiles {
	Date dateobj = new Date();

	public int generateRandomNum() {

		Random random = new Random();
		int randomInt = random.nextInt(10000);
		return randomInt;
	}

	public String generateRandomEmail() {
		Faker faker = new Faker();
		return faker.internet().emailAddress();
	}

	public String getCurrentSystemDataAndTime() {

		String currentDate = dateobj.toString();
		return currentDate;
	}

	public String getCurrentYear() {
		String currentDate = dateobj.toString();
		String[] arr = currentDate.split(" ");
		return arr[5];
	}

	public String getMonth() {
		String currentDate = dateobj.toString();
		String[] arr = currentDate.split(" ");
		return arr[1];
	}

	public int getMonthInt() {
		dateobj.toString();

		return dateobj.getMonth();
	}

	public String getDate() {
		String currentDate = dateobj.toString();
		String[] arr = currentDate.split(" ");
		return arr[2];
	}
}
