# Custom-adapter-with-Recycler-View-with-onclick-event

Basic Steps

1)Create activity or fregment

2)Create resourse file in layout (home_row.xml)

3)Create Model class if necessary (homeModel.java)

4)Create custome adapter (homeAdapter.java)

   ->Create simple java class and extends Recyclerview.adapter<> 
  
   ->Create sub class and extends Recycerview.Viewholder (for get view of resourse file) 

   ->Modify main class's syntax Recyclerview.adapter<name of holder subclass> 
  
   ->implement methods
  
   ->create sub interface for performs differnt methods on views
  
   ->Main Constructor
      
       intialize parameters and listener
      
   ->Do Changes in method getItemCount()
      
       arraylist.size() 
      
   ->OnCreateViewHolder()
  
       set layout inflater
      
   ->onBindViewHolder()
      
        set values to the controls of view with help of helper class and model class's object
       
 5)Activity or fragmnet
 
   ->set layout of recycler view
   
   ->Create obj of CustomAdapter and intialize it
  
   ->set adapter to recyclerview
  
   ->implements onclick method of interface
