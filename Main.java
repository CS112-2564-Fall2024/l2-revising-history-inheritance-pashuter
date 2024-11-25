public class Main {
	public static void main(String[] args) {
		// Example: Tulsa Race Massacre
		String tulsaDescription = "A black teenager was arrested and accused of assaulting a white woman on an elevator. A white mob gathered, leading to violence and destruction.";
		Date tulsaDay = new Date(5, 31, 1921);
		HistoricalEvent tulsaRiot = new HistoricalEvent(tulsaDescription, tulsaDay);

		System.out.println("====================================================");
		System.out.println("HISTORICAL EVENT EXAMPLE:");
		System.out.println("====================================================");
		System.out.println(tulsaRiot);

		String tulsaRevised = "On May 31, 1921, a white mob attacked the Black community of Greenwood, destroying 35 blocks and killing 300 people. This was one of the worst incidents of racial violence in US history.";
		String tulsaCitation = "https://www.smithsonianmag.com/";
		RevisedHistoricalEvent tulsaMassacre = new RevisedHistoricalEvent(tulsaDescription, tulsaDay, tulsaRevised, tulsaCitation);

		System.out.println("\n====================================================");
		System.out.println("REVISED HISTORICAL EVENT EXAMPLE:");
		System.out.println("====================================================");
		tulsaMassacre.teach();

		// Example: Discovery of America
		String columbusDescription = "Christopher Columbus discovered America in 1492.";
		Date columbusDay = new Date(10, 12, 1492);
		HistoricalEvent columbusEvent = new HistoricalEvent(columbusDescription, columbusDay);

		System.out.println("\n====================================================");
		System.out.println("HISTORICAL EVENT EXAMPLE:");
		System.out.println("====================================================");
		System.out.println(columbusEvent);

		String columbusRevised = "Christopher Columbus arrived in the Americas in 1492, where Indigenous civilizations had thrived for thousands of years. His arrival marked the beginning of colonization and widespread atrocities.";
		String columbusCitation = "https://www.history.com/";
		RevisedHistoricalEvent columbusRevision = new RevisedHistoricalEvent(columbusDescription, columbusDay, columbusRevised, columbusCitation);

		System.out.println("\n====================================================");
		System.out.println("REVISED HISTORICAL EVENT EXAMPLE:");
		System.out.println("====================================================");
		columbusRevision.teach();
	}
}