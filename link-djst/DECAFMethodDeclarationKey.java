public class DECAFMethodDeclarationKey{
	private final String name;
	private final String signature;

	public DECAFMethodDeclarationKey(String name, String signature){
		this.name = name;
		this.signature = signature;
	}

	@Override 
	public boolean equals(Object o){
		if(this == o) return true;
		if(!(o instanceof DECAFMethodDeclarationKey)) return false;
		DECAFMethodDeclarationKey key = (DECAFMethodDeclarationKey) o;
		return this.name.equals(key.name) && this.signature.equals(key.signature);
	}

	@Override
	public int hashCode(){
		char nameBuffer[];
		char signatureBuffer[];

		nameBuffer = this.name.toCharArray();
		signatureBuffer = this.signature.toCharArray();

		int x, y, i;
		x = y = 0;
		
		for(i = 0; i < this.name.length(); i++ ){
			x += nameBuffer[i];
		}

		for(i = 0; i < this.signature.length(); i++){
			y += signatureBuffer[i];
		}
		x =  (x << 16) + y;
		System.out.println("MethodDeclarationKey "+this.name+", "+this.signature+" with Key "+x);
		return x;
	}
} 
