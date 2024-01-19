package inheritance;

	public class HarryPotter extends Book{
		private String name ="HarryPotter";
		HarryPotter(int quantity)
		{
			super(quantity);
		}
		public String getName()
		{
			return name;
		}

		}


