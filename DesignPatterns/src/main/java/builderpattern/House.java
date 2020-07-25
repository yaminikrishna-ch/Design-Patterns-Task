package builderpattern;
class House implements HousePlan 
{ 
  
    @SuppressWarnings("unused")
	private String basement; 
    @SuppressWarnings("unused")
	private String structure; 
    @SuppressWarnings("unused")
	private String roof; 
    @SuppressWarnings("unused")
	private String interior; 
  
    public void setBasement(String basement)  
    { 
        this.basement = basement; 
    } 
  
    public void setStructure(String structure)  
    { 
        this.structure = structure; 
    } 
  
    public void setRoof(String roof)  
    { 
        this.roof = roof; 
    } 
  
    public void setInterior(String interior)  
    { 
        this.interior = interior; 
    } 
  
} 