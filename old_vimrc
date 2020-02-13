:syntax on
:set hlsearch
" Press Space to turn off highlighting and clear any message already displayed.
:nnoremap <silent> <Space> :nohlsearch<Bar>:echo<CR>

" set encoding
set encoding=utf8

" --------------------------------------
:set showmatch
:set ts=4
":set syntax=python
:set smartindent

:set scrolloff=5
:set sidescroll=1

:set hidden
" --------------------------------------
:set expandtab ts=4 sw=4 ai

:set list listchars=tab:»\ ,trail:·,extends:»,precedes:«
:set ft=creole tw=78
:set tags=tags;

"prerequis tags
set nocp
filetype plugin on

" OmniCppComplete
let OmniCpp_NamespaceSearch = 1
let OmniCpp_GlobalScopeSearch = 1
let OmniCpp_ShowAccess = 1
let OmniCpp_MayCompleteDot = 1
let OmniCpp_MayCompleteArrow = 1
let OmniCpp_MayCompleteScope = 1
let OmniCpp_DefaultNamespaces = ["std", "_GLIBCXX_STD"]

" automatically open and close the popup menu / preview window
au CursorMovedI,InsertLeave * if pumvisible() == 0|silent! pclose|endif
set completeopt=menuone,menu,longest,preview

map <silent> <F3> :call BufferList()<CR>
map <silent> cf zf%
let g:BufferListWidth = 25
let g:BufferListMaxWidth = 50
hi BufferSelected term=reverse ctermfg=white ctermbg=red cterm=bold
hi BufferNormal term=NONE ctermfg=black ctermbg=darkcyan cterm=NONE

" language tool location
let g:languagetool_jar=$HOME . '/.vim/languagetool/dist/LanguageTool.jar'

" Make TAB switch between windows in normal mode.  Note that this also maps  
" <C-I>, since terminals don't distinguish between the two.
map <Tab> <C-W>w

" Make F1..F6 switch to tabs 1..6.
map <F1> 1gt
map <F2> 2gt
map <F3> 3gt
map <F4> 4gt
map <F5> 5gt
map <F6> 6gt
map <F7> gT
map <F8> gt

if has("cscope")
        " Look for a 'cscope.out' file starting from the current directory,
        " going up to the root directory.

        if (filereadable("cscope.out"))
                execute "cs add cscope.out"
        else
                let s:dirs = split(getcwd(), "/")
                while s:dirs != []
                        let s:path = "/" . join(s:dirs, "/")
                        if (filereadable(s:path . "/cscope.out"))
                                execute "cs add " . s:path . "/cscope.out " . s:path
                                break
                        endif
                        let s:dirs = s:dirs[:-2]
                endwhile
        endif

        set csto=0
        set cst
        set csverb

        nmap <C-\>s :cs find s <C-R>=expand("<cword>")<CR><CR>
        nmap <C-\>g :cs find g <C-R>=expand("<cword>")<CR><CR>
        nmap <C-\>c :cs find c <C-R>=expand("<cword>")<CR><CR>
        nmap <C-\>t :cs find t <C-R>=expand("<cword>")<CR><CR>
        nmap <C-\>e :cs find e <C-R>=expand("<cword>")<CR><CR>
        nmap <C-\>f :cs find f <C-R>=expand("<cfile>")<CR><CR>
        nmap <C-\>i :cs find i ^<C-R>=expand("<cfile>")<CR>$<CR>
        nmap <C-\>d :cs find d <C-R>=expand("<cword>")<CR><CR>

        map <F10> :copen<CR>
        map <F11> :cprevious<CR>
        map <F12> :cnext<CR>

        " Open a quicfix window for the following queries.
        set cscopequickfix=s-,c-,d-,i-,t-,e-,g-
endif

