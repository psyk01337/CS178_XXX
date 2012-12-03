package sarral.mangubatc.act01;


public class SpinnerEntry {

	/** The unique id of this contact as defined in the raw contact table **/
	private final int contactId;


	/** The name which should be displayed for this contact **/
	private final String contactName;

	public SpinnerEntry(int contactID, 
			String contactName) {
		this.contactId = contactID;
		this.contactName = contactName;
	}

	public int getContactId() {
		return contactId;
	}

	public String getContactName() {
		return contactName;
	}

}
