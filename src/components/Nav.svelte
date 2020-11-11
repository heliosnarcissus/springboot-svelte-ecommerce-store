<script>
    import { goto } from '@sveltech/routify'
</script>

<style>

</style>


<body class=" flex flex-col bg-gray-900 z-30 border-b-2 border-gray-800 shadow-lg">
       
      <section class="flex justify-center items-start mt-2 pt-4 px-3 shadow ">
          
            <section class="-ml-2 rounded flex items-center flex rounded-full bg-gray-800 border-pink-900 border-2">
               <button on:click={()=>$goto('/')} class="focus:outline-none">
                     <svg class="w-8 h-8 text-pink-700 stroke-current" fill="none" stroke="currentColor" viewBox="0 0 24 24" xmlns="http://www.w3.org/2000/svg"><path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M15 19l-7-7 7-7"></path></svg>
               </button>
            </section>

            <section class="flex flex-col justify-end items-end  px-3 w-56 bg-red">
                
                <span class=" flex text-gray-100 font-sans text-white ">Rey Anthony C Renacia</span>
                <span class=" flex text-gray-100 font-sans text-blue-600 text-sm mb-2">Full Stack Developer</span>

                <div class="flex items-between text-gray-700 max-w-sm -mr-2 mb-3">
                      <a href="https://www.github.com/heliosnarcissus" target="_blank">
                            <svg class="mx-2 h-8 w-8 fill-current" fill="current" xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24"><path d="M12 0c-6.626 0-12 5.373-12 12 0 5.302 3.438 9.8 8.207 11.387.599.111.793-.261.793-.577v-2.234c-3.338.726-4.033-1.416-4.033-1.416-.546-1.387-1.333-1.756-1.333-1.756-1.089-.745.083-.729.083-.729 1.205.084 1.839 1.237 1.839 1.237 1.07 1.834 2.807 1.304 3.492.997.107-.775.418-1.305.762-1.604-2.665-.305-5.467-1.334-5.467-5.931 0-1.311.469-2.381 1.236-3.221-.124-.303-.535-1.524.117-3.176 0 0 1.008-.322 3.301 1.23.957-.266 1.983-.399 3.003-.404 1.02.005 2.047.138 3.006.404 2.291-1.552 3.297-1.23 3.297-1.23.653 1.653.242 2.874.118 3.176.77.84 1.235 1.911 1.235 3.221 0 4.609-2.807 5.624-5.479 5.921.43.372.823 1.102.823 2.222v3.293c0 .319.192.694.801.576 4.765-1.589 8.199-6.086 8.199-11.386 0-6.627-5.373-12-12-12z"/></svg>
                      </a>
                      <a href="https://stackoverflow.com/users/6143482/noogui?tab=profile" target="_blank">
                          <svg class="mx-2 h-8 w-8 fill-current " fill="current"  xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24"><path d="M12 0c-6.627 0-12 5.373-12 12s5.373 12 12 12 12-5.373 12-12-5.373-12-12-12zm.869 5.903l3.114 4.567-.975.665-3.115-4.567.976-.665zm-2.812 2.585l4.84 2.838-.6 1.017-4.842-2.838.602-1.017zm-1.276 2.724l5.413 1.521-.291 1.077-5.428-1.458.306-1.14zm-.588 2.461l5.687.569-.103 1.12-5.691-.513.107-1.176zm-.169 2.16h5.835v1.167h-5.835v-1.167zm7.976 3.167h-10v-6h1v5h8v-5h1v6zm.195-8.602l-.945-5.446 1.162-.202.947 5.446-1.164.202z"/></svg>
                      </a>   
                      <a href="https://www.linkedin.com/in/rey-anthony-renacia-a7081069/"  target="_blank">
                          <svg class="mx-2 h-8 w-8 fill-current " fill="current"  xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24"><path d="M12 0c-6.627 0-12 5.373-12 12s5.373 12 12 12 12-5.373 12-12-5.373-12-12-12zm-2 16h-2v-6h2v6zm-1-6.891c-.607 0-1.1-.496-1.1-1.109 0-.612.492-1.109 1.1-1.109s1.1.497 1.1 1.109c0 .613-.493 1.109-1.1 1.109zm8 6.891h-1.998v-2.861c0-1.881-2.002-1.722-2.002 0v2.861h-2v-6h2v1.093c.872-1.616 4-1.736 4 1.548v3.359z"/></svg>
                      </a>
                      <a href="https://www.youtube.com/watch?v=GJRPbqJM2JU&list=PLwjfheed3xCi7SXoLcj-wjiIqd0q0KEdh&index=9" target="_blank">
                        <svg class="mx-2 h-8 w-8  fill-current " fill="current"  xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24"><path d="M10.918 13.933h.706v3.795h-.706v-.419c-.13.154-.266.272-.405.353-.381.218-.902.213-.902-.557v-3.172h.705v2.909c0 .153.037.256.188.256.138 0 .329-.176.415-.284v-2.881zm.642-4.181c.2 0 .311-.16.311-.377v-1.854c0-.223-.098-.38-.324-.38-.208 0-.309.161-.309.38v1.854c-.001.21.117.377.322.377zm-1.941 2.831h-2.439v.747h.823v4.398h.795v-4.398h.821v-.747zm4.721 2.253v2.105c0 .47-.176.834-.645.834-.259 0-.474-.094-.671-.34v.292h-.712v-5.145h.712v1.656c.16-.194.375-.354.628-.354.517.001.688.437.688.952zm-.727.043c0-.128-.024-.225-.075-.292-.086-.113-.244-.125-.367-.062l-.146.116v2.365l.167.134c.115.058.283.062.361-.039.04-.054.061-.141.061-.262v-1.96zm10.387-2.879c0 6.627-5.373 12-12 12s-12-5.373-12-12 5.373-12 12-12 12 5.373 12 12zm-10.746-2.251c0 .394.12.712.519.712.224 0 .534-.117.855-.498v.44h.741v-3.986h-.741v3.025c-.09.113-.291.299-.436.299-.159 0-.197-.108-.197-.269v-3.055h-.741v3.332zm-2.779-2.294v1.954c0 .703.367 1.068 1.085 1.068.597 0 1.065-.399 1.065-1.068v-1.954c0-.624-.465-1.071-1.065-1.071-.652 0-1.085.432-1.085 1.071zm-2.761-2.455l.993 3.211v2.191h.835v-2.191l.971-3.211h-.848l-.535 2.16-.575-2.16h-.841zm10.119 10.208c-.013-2.605-.204-3.602-1.848-3.714-1.518-.104-6.455-.103-7.971 0-1.642.112-1.835 1.104-1.848 3.714.013 2.606.204 3.602 1.848 3.715 1.516.103 6.453.103 7.971 0 1.643-.113 1.835-1.104 1.848-3.715zm-.885-.255v.966h-1.35v.716c0 .285.024.531.308.531.298 0 .315-.2.315-.531v-.264h.727v.285c0 .731-.313 1.174-1.057 1.174-.676 0-1.019-.491-1.019-1.174v-1.704c0-.659.435-1.116 1.071-1.116.678.001 1.005.431 1.005 1.117zm-.726-.007c0-.256-.054-.445-.309-.445-.261 0-.314.184-.314.445v.385h.623v-.385z"/></svg>
                      </a>        
                </div>
            </section>

            <section class="flex justify-center py-1 ">
                  <img class="flex w-9 h-9 rounded-full border-teal-600 border-2"
                      src="/static/images/reyanthonyrenacia.jpeg" alt="reyanthonyrenacia.jpeg" />
            </section>
            
        </section>
</body>
    
   
   
      











<!--OLD VERSION 
<script>
    import { fade, fly } from 'svelte/transition';
  
   
  
   </script>
<section class=" flex flex-col bg-gray-900 z-10">
       <div class="flex justify-center py-2">
           <img class="h-16 w-16 rounded-full border-teal-600 border-2"
           src="/static/images/reyanthonyrenacia.jpeg" alt="reyanthonyrenacia.jpeg" />
      
       </div>
       <div class="flex flex-col justify-center ">
   
          <h3 class="-mt-2 text-gray-100 font-sans font-bold text-white text-2xl mx-auto py-y mb-2">Rey Anthony C Renacia</h3>
          <h2 class="text-gray-100 font-sans text-blue-600 text-xl mx-auto ">Full Stack Developer</h2>
           <!--p class=" px-1 text-gray-300 text-sm font-light" >noogui@protonmail.com</p><br/
       </div>
   
       <div class="flex justify-center p-3 text-gray-700 ">
           <a href="https://www.github.com/heliosnarcissus" target="_blank">
                 <svg class="px-2 mx-1 h-12 w-12 fill-current border-2 border-gray-800 rounded-full" fill="current" xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24"><path d="M12 0c-6.626 0-12 5.373-12 12 0 5.302 3.438 9.8 8.207 11.387.599.111.793-.261.793-.577v-2.234c-3.338.726-4.033-1.416-4.033-1.416-.546-1.387-1.333-1.756-1.333-1.756-1.089-.745.083-.729.083-.729 1.205.084 1.839 1.237 1.839 1.237 1.07 1.834 2.807 1.304 3.492.997.107-.775.418-1.305.762-1.604-2.665-.305-5.467-1.334-5.467-5.931 0-1.311.469-2.381 1.236-3.221-.124-.303-.535-1.524.117-3.176 0 0 1.008-.322 3.301 1.23.957-.266 1.983-.399 3.003-.404 1.02.005 2.047.138 3.006.404 2.291-1.552 3.297-1.23 3.297-1.23.653 1.653.242 2.874.118 3.176.77.84 1.235 1.911 1.235 3.221 0 4.609-2.807 5.624-5.479 5.921.43.372.823 1.102.823 2.222v3.293c0 .319.192.694.801.576 4.765-1.589 8.199-6.086 8.199-11.386 0-6.627-5.373-12-12-12z"/></svg>
           </a>
           <a href="https://stackoverflow.com/users/6143482/noogui?tab=profile" target="_blank">
                <svg class="px-2 mx-1 h-12 w-12 fill-current  border-2 border-gray-800 rounded-full" fill="current"  xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24"><path d="M12 0c-6.627 0-12 5.373-12 12s5.373 12 12 12 12-5.373 12-12-5.373-12-12-12zm.869 5.903l3.114 4.567-.975.665-3.115-4.567.976-.665zm-2.812 2.585l4.84 2.838-.6 1.017-4.842-2.838.602-1.017zm-1.276 2.724l5.413 1.521-.291 1.077-5.428-1.458.306-1.14zm-.588 2.461l5.687.569-.103 1.12-5.691-.513.107-1.176zm-.169 2.16h5.835v1.167h-5.835v-1.167zm7.976 3.167h-10v-6h1v5h8v-5h1v6zm.195-8.602l-.945-5.446 1.162-.202.947 5.446-1.164.202z"/></svg>
           </a>   
           <a href="https://www.linkedin.com/in/rey-anthony-renacia-a7081069/"  target="_blank">
                <svg class="px-2 mx-1 h-12 w-12 fill-current  border-2 border-gray-800 rounded-full" fill="current"  xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24"><path d="M12 0c-6.627 0-12 5.373-12 12s5.373 12 12 12 12-5.373 12-12-5.373-12-12-12zm-2 16h-2v-6h2v6zm-1-6.891c-.607 0-1.1-.496-1.1-1.109 0-.612.492-1.109 1.1-1.109s1.1.497 1.1 1.109c0 .613-.493 1.109-1.1 1.109zm8 6.891h-1.998v-2.861c0-1.881-2.002-1.722-2.002 0v2.861h-2v-6h2v1.093c.872-1.616 4-1.736 4 1.548v3.359z"/></svg>
           </a>
           <a href="https://www.youtube.com/watch?v=GJRPbqJM2JU&list=PLwjfheed3xCi7SXoLcj-wjiIqd0q0KEdh&index=9" target="_blank">
             <svg class="px-2 mx-1 h-12 w-12 fill-current  border-2 border-gray-800 rounded-full" fill="current"  xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24"><path d="M10.918 13.933h.706v3.795h-.706v-.419c-.13.154-.266.272-.405.353-.381.218-.902.213-.902-.557v-3.172h.705v2.909c0 .153.037.256.188.256.138 0 .329-.176.415-.284v-2.881zm.642-4.181c.2 0 .311-.16.311-.377v-1.854c0-.223-.098-.38-.324-.38-.208 0-.309.161-.309.38v1.854c-.001.21.117.377.322.377zm-1.941 2.831h-2.439v.747h.823v4.398h.795v-4.398h.821v-.747zm4.721 2.253v2.105c0 .47-.176.834-.645.834-.259 0-.474-.094-.671-.34v.292h-.712v-5.145h.712v1.656c.16-.194.375-.354.628-.354.517.001.688.437.688.952zm-.727.043c0-.128-.024-.225-.075-.292-.086-.113-.244-.125-.367-.062l-.146.116v2.365l.167.134c.115.058.283.062.361-.039.04-.054.061-.141.061-.262v-1.96zm10.387-2.879c0 6.627-5.373 12-12 12s-12-5.373-12-12 5.373-12 12-12 12 5.373 12 12zm-10.746-2.251c0 .394.12.712.519.712.224 0 .534-.117.855-.498v.44h.741v-3.986h-.741v3.025c-.09.113-.291.299-.436.299-.159 0-.197-.108-.197-.269v-3.055h-.741v3.332zm-2.779-2.294v1.954c0 .703.367 1.068 1.085 1.068.597 0 1.065-.399 1.065-1.068v-1.954c0-.624-.465-1.071-1.065-1.071-.652 0-1.085.432-1.085 1.071zm-2.761-2.455l.993 3.211v2.191h.835v-2.191l.971-3.211h-.848l-.535 2.16-.575-2.16h-.841zm10.119 10.208c-.013-2.605-.204-3.602-1.848-3.714-1.518-.104-6.455-.103-7.971 0-1.642.112-1.835 1.104-1.848 3.714.013 2.606.204 3.602 1.848 3.715 1.516.103 6.453.103 7.971 0 1.643-.113 1.835-1.104 1.848-3.715zm-.885-.255v.966h-1.35v.716c0 .285.024.531.308.531.298 0 .315-.2.315-.531v-.264h.727v.285c0 .731-.313 1.174-1.057 1.174-.676 0-1.019-.491-1.019-1.174v-1.704c0-.659.435-1.116 1.071-1.116.678.001 1.005.431 1.005 1.117zm-.726-.007c0-.256-.054-.445-.309-.445-.261 0-.314.184-.314.445v.385h.623v-.385z"/></svg>
           </a>        
       </div>
      
   
</section>
-->