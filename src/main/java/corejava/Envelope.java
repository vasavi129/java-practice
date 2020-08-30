package corejava;

//import java.util.Date;

public class Envelope {
	
private int EnvelopeId;
private String EnvelopeName;
private String createdAt;

private String modifiedAt;

public Envelope() {
	super();
}

public Envelope(int envelopeId, String envelopeName, String createdAt, String modifiedAt) {
	super();
	EnvelopeId = envelopeId;
	EnvelopeName = envelopeName;
	this.createdAt = createdAt;
	this.modifiedAt = modifiedAt;
}

public int getEnvelopeId() {
	return EnvelopeId;
}

public void setEnvelopeId(int envelopeId) {
	EnvelopeId = envelopeId;
}

public String getEnvelopeName() {
	return EnvelopeName;
}

public void setEnvelopeName(String envelopeName) {
	EnvelopeName = envelopeName;
}

public String getCreatedAt() {
	return createdAt;
}

public void setCreatedAt(String createdAt) {
	this.createdAt = createdAt;
}

public String getModifiedAt() {
	return modifiedAt;
}

public void setModifiedAt(String modifiedAt) {
	this.modifiedAt = modifiedAt;
}


@Override
public int hashCode() {
	System.out.println("====================In Hashcode==============================");
	final int prime = 31;
	int result = prime * EnvelopeId;
	System.out.println("hashcode is "+result);
		return result;
}

@Override
public boolean equals(Object obj) {
	System.out.println("=============In equals=======================");
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	System.out.println(getClass());
	if (getClass() != obj.getClass())
		return false;
	Envelope other = (Envelope) obj;
	if (EnvelopeId != other.EnvelopeId)
		return false;
	return true;
}

@Override
public String toString() {
	return "Envelope [EnvelopeId=" + EnvelopeId + ", EnvelopeName=" + EnvelopeName + ", createdAt=" + createdAt
			+ ", modifiedAt=" + modifiedAt + "]";
} 


}

